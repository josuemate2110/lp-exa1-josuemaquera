package pe.edu.upeu.lpexa1josuemaquera.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lpexa1josuemaquera.dao.Detalle_PedidoDao;
import pe.edu.upeu.lpexa1josuemaquera.dao.PedidosDao;
import pe.edu.upeu.lpexa1josuemaquera.entity.Pedidos;
import pe.edu.upeu.lpexa1josuemaquera.service.PedidosService;
@Service
public class PedidosServiceImp implements PedidosService{
	@Autowired
	private PedidosDao pedidosDao;
	@Override
	public List<Pedidos> readAll() {
		// TODO Auto-generated method stub
		return pedidosDao.readAll();
	}

	@Override
	public Pedidos readById(int Id) {
		// TODO Auto-generated method stub
		return pedidosDao.readById(Id);
	}

	@Override
	public int createPedidos(Pedidos pedido) {
		// TODO Auto-generated method stub
		return pedidosDao.createPedidos(pedido);
	}

	@Override
	public int deletePedidos(int Id) {
		// TODO Auto-generated method stub
		return pedidosDao.deletePedidos(Id);
	}

}
