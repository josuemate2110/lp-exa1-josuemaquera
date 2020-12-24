package pe.edu.upeu.lpexa1josuemaquera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.event.AuthenticationCredentialsNotFoundEvent;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lpexa1josuemaquera.entity.Usuario;
import pe.edu.upeu.lpexa1josuemaquera.security.JwtUtil;

import pe.edu.upeu.lpexa1josuemaquera.entity.Detalle_Pedido;
import pe.edu.upeu.lpexa1josuemaquera.service.Detalle_PedidoService;

import pe.edu.upeu.lpexa1josuemaquera.entity.Pedidos;
import pe.edu.upeu.lpexa1josuemaquera.service.PedidosService;

import pe.edu.upeu.lpexa1josuemaquera.entity.Platos;
import pe.edu.upeu.lpexa1josuemaquera.service.PlatosService;

@RestController
public class Homecontroller {
	@Autowired
	private Detalle_PedidoService detalle_PedidoService;
	@Autowired
	private PedidosService pedidosService;
	@Autowired
	private PlatosService platosService;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
@GetMapping("/detallepedido/all")
public List<Detalle_Pedido> detalle_pedidoReadAll() {
	return detalle_PedidoService.readAll();
}
@GetMapping("/detallepedido/id/{Id}")
public List<Detalle_Pedido> detalle_pedidoReadById(@PathVariable int Id) {
	System.out.println("Llega");
	return detalle_PedidoService.readByIdPedido(Id);
}
@PostMapping("/detallepedido/create")
public int createDetalle_Pedido(@RequestBody Detalle_Pedido detalle) {
	return detalle_PedidoService.createDetalle_Pedido(detalle);
}
@GetMapping("/detallepedido/delete/{Id}")
public int deleteDetalle_Pedido(@PathVariable int Id) {
	return detalle_PedidoService.deleteDetalle_Pedido(Id);
}
@GetMapping("/pedido/all")
public List<Pedidos> pedidoReadAll() {
	return pedidosService.readAll();
}
@GetMapping("/pedido/id/{Id}")
public Pedidos pedidosReadById(int Id) {
	return pedidosService.readById(Id);
}
@PostMapping("/pedido/create")
public int createPedidos(@RequestBody Pedidos pedido) {
	return pedidosService.createPedidos(pedido);
}
@GetMapping("/pedido/delete/{Id}")
public int deletePedidos(@PathVariable int Id) {
	return pedidosService.deletePedidos(Id);
}
@GetMapping("/platos/all")
public List<Platos> platosReadAll() {
	return platosService.readAll();
}
@GetMapping("/platos/id/{Id}")
public Platos platosReadById(@PathVariable int Id) {
	return platosService.readById(Id);
}
@GetMapping("/platos/updatestock/{Id}/{Cantidad}")
public int pedidosUpdateStockById(@PathVariable int Id, @PathVariable int Cantidad) {
	return platosService.updateStockById(Id, Cantidad);
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