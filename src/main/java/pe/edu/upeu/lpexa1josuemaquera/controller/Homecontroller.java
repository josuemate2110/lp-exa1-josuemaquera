package pe.edu.upeu.lpexa1josuemaquera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lpexa1josuemaquera.entity.Detalle_Pedido;
import pe.edu.upeu.lpexa1josuemaquera.service.Detalle_PedidoService;

@RestController
public class Homecontroller {
	@Autowired
	private Detalle_PedidoService detalle_PedidoService;
@GetMapping("/")
public List<Detalle_Pedido> mensaje() {
	return detalle_PedidoService.readAll();
}
}