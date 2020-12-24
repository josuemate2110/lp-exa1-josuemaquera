package pe.edu.upeu.lpexa1josuemaquera.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lpexa1josuemaquera.dao.PedidosDao;
import pe.edu.upeu.lpexa1josuemaquera.entity.Pedidos;
import pe.edu.upeu.lpexa1josuemaquera.entity.Platos;
@Repository
public class PedidosDaoImp implements PedidosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Pedidos> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select*from Pedidos", BeanPropertyRowMapper.newInstance(Pedidos.class));
	}

	@Override
	public Pedidos readById(int Id) {
		// TODO Auto-generated method stub
		String SQL="select*from pedidos where idpedidos=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {Id},new BeanPropertyRowMapper<Pedidos>(Pedidos.class));
	}

	@Override
	public int createPedidos(Pedidos pedido) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletePedidos(int Id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
