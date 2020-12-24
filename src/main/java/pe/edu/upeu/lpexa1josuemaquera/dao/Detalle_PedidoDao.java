package pe.edu.upeu.lpexa1josuemaquera.dao;
import java.util.List;
import pe.edu.upeu.lpexa1josuemaquera.entity.Detalle_Pedido;

public interface Detalle_PedidoDao {
List<Detalle_Pedido>readAll(); 
List<Detalle_Pedido>readByIdPedido(int Id);
int createDetalle_Pedido(Detalle_Pedido detalle);
int deleteDetalle_Pedido(int Id);
}
