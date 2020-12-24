package pe.edu.upeu.lpexa1josuemaquera.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lpexa1josuemaquera.dao.Detalle_PedidoDao;
import pe.edu.upeu.lpexa1josuemaquera.entity.Detalle_Pedido;
import pe.edu.upeu.lpexa1josuemaquera.service.Detalle_PedidoService;
@Service
public class Detalle_PedidoServiceImp implements Detalle_PedidoService{
@Autowired
private Detalle_PedidoDao detalle_PedidoDao;
	@Override
	public List<Detalle_Pedido> readAll() {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.readAll();
	}
	@Override
	public List<Detalle_Pedido> readByIdPedido(int Id) {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.readByIdPedido(Id);
	}
	@Override
	public int createDetalle_Pedido(Detalle_Pedido detalle) {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.createDetalle_Pedido(detalle);
	}
	@Override
	public int deleteDetalle_Pedido(int Id) {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.deleteDetalle_Pedido(Id);
	}


}
