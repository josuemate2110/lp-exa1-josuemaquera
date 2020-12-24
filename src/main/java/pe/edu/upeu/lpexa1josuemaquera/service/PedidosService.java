package pe.edu.upeu.lpexa1josuemaquera.service;
import java.util.List;
import pe.edu.upeu.lpexa1josuemaquera.entity.Pedidos;

public interface PedidosService {
	public List<Pedidos>readAll();
	public Pedidos readById(int Id);
	public int createPedidos(Pedidos pedido);
	public int deletePedidos(int Id);
}
