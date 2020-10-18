package pe.edu.upeu.lpexa1josuemaquera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.event.AuthenticationCredentialsNotFoundEvent;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lpexa1josuemaquera.entity.Usuario;
import pe.edu.upeu.lpexa1josuemaquera.security.JwtUtil;

import pe.edu.upeu.lpexa1josuemaquera.entity.Detalle_Pedido;
import pe.edu.upeu.lpexa1josuemaquera.service.Detalle_PedidoService;

@RestController
public class Homecontroller {
	@Autowired
	private Detalle_PedidoService detalle_PedidoService;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
@GetMapping("/detalle_pedido")
public List<Detalle_Pedido> mensaje() {
	return detalle_PedidoService.readAll();
}
@PostMapping("/authenticate")
public String generateToken(@RequestBody Usuario authRequest) throws Exception {
    try {
    	System.out.println(authRequest.getNomuser());
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getNomuser(), authRequest.getClave()));
    } catch (Exception ex) {
        throw new Exception("Error: "+ex);
    }
return jwtUtil.generateToken(authRequest.getNomuser());
}
}