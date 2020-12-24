package pe.edu.upeu.lpexa1josuemaquera.daoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lpexa1josuemaquera.dao.PlatosDao;
import pe.edu.upeu.lpexa1josuemaquera.entity.Platos;
@Repository
public class PlatosDaoImp implements PlatosDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Platos> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select*from Platos", BeanPropertyRowMapper.newInstance(Platos.class));
	}

	@Override
	public Platos readById(int Id) {
		// TODO Auto-generated method stub
		String SQL="select*from platos where idplatos=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {Id},new BeanPropertyRowMapper<Platos>(Platos.class));
	}

	@Override
	public int updateStockById(int Id, int Cantidad) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update Platos set Cantidad=? where idplatos=?", Cantidad, Id);
	}

}
