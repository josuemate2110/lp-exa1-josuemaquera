package pe.edu.upeu.lpexa1josuemaquera.dao;
import java.util.List;
import pe.edu.upeu.lpexa1josuemaquera.entity.Platos;

public interface PlatosDao {
List<Platos>readAll();
Platos readById(int Id);
int updateStockById(int Id,int Cantidad);
}
