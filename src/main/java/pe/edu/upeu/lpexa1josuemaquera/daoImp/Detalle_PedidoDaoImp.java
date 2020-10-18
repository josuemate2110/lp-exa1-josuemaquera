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

}
