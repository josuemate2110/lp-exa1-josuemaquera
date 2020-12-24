package pe.edu.upeu.lpexa1josuemaquera.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lpexa1josuemaquera.dao.Detalle_PedidoDao;
import pe.edu.upeu.lpexa1josuemaquera.dao.PlatosDao;
import pe.edu.upeu.lpexa1josuemaquera.entity.Platos;
import pe.edu.upeu.lpexa1josuemaquera.service.PlatosService;
@Service
public class PlatosServiceImp implements PlatosService{
	@Autowired
	private PlatosDao platosDao;
	@Override
	public List<Platos> readAll() {
		// TODO Auto-generated method stub
		return platosDao.readAll();
	}

	@Override
	public Platos readById(int Id) {
		// TODO Auto-generated method stub
		return platosDao.readById(Id);
	}

	@Override
	public int updateStockById(int Id, int Cantidad) {
		// TODO Auto-generated method stub
		return platosDao.updateStockById(Id, Cantidad);
	}

}
