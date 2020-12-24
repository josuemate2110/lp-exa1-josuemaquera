package pe.edu.upeu.lpexa1josuemaquera.dao;
import java.util.List;
import pe.edu.upeu.lpexa1josuemaquera.entity.Pedidos;

public interface PedidosDao {
List<Pedidos>readAll();
Pedidos readById(int Id);
int createPedidos(Pedidos pedido);
int deletePedidos(int Id);
}
