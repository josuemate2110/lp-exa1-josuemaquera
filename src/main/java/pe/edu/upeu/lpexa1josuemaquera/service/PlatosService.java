package pe.edu.upeu.lpexa1josuemaquera.service;
import java.util.List;
import pe.edu.upeu.lpexa1josuemaquera.entity.Platos;

public interface PlatosService {
	public List<Platos>readAll();
	public Platos readById(int Id);
	public int updateStockById(int Id,int Cantidad);
}
