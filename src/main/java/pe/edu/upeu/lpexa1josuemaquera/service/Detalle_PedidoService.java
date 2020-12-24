package pe.edu.upeu.lpexa1josuemaquera.service;
import java.util.List;
import pe.edu.upeu.lpexa1josuemaquera.entity.Detalle_Pedido;

public interface Detalle_PedidoService {
public List<Detalle_Pedido>readAll();
public List<Detalle_Pedido>readByIdPedido(int Id);
public int createDetalle_Pedido(Detalle_Pedido detalle);
public int deleteDetalle_Pedido(int Id);
}
