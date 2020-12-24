package pe.edu.upeu.lpexa1josuemaquera.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.lpexa1josuemaquera.dao.Detalle_PedidoDao;
import pe.edu.upeu.lpexa1josuemaquera.entity.Detalle_Pedido;

@Repository
public class Detalle_PedidoDaoImp implements Detalle_PedidoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Detalle_Pedido> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select*from Detalle_Pedido", BeanPropertyRowMapper.newInstance(Detalle_Pedido.class));
	}
	@Override
	public List<Detalle_Pedido> readByIdPedido(int Id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select*from Detalle_Pedido where idpedidos=?",new Object[] {Id} , BeanPropertyRowMapper.newInstance(Detalle_Pedido.class));
	}
	@Override
	public int createDetalle_Pedido(Detalle_Pedido detalle) {
		// TODO Auto-generated method stub
		String SQL="insert into Detalle_pedido(precio, cantidad, idplatos, idpedidos) values(?, ?, ?, ?)";
		return jdbcTemplate.update(SQL, detalle.getPrecio(), detalle.getCantidad(), detalle.getIdplatos(), detalle.getIdpedidos());
	}
	@Override
	public int deleteDetalle_Pedido(int Id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from detalle_pedido where iddetalle_pedido=?", Id);
	}
}
