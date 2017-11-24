package com.toweb.springjdbc.daoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.toweb.springjdbc.dao.ReceptorDAO;
import com.toweb.springjdbc.model.ReceptorDTO;

@Repository
public class ReceptorDAOImp implements ReceptorDAO {
	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException{
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public List<ReceptorDTO> listAllReceptors() {
		String sql = "select idclientes,razonsocial,rfc,estado,website,telefonos,rfcEmpresa,tipo,calle,numeroe,colonia,municipio,cp,email,cc,numeroi,respresentantelegal,regimenfiscal,numctapago from clientes";
		List<ReceptorDTO> list = this.namedParameterJdbcTemplate.query(sql,getSqlParameterByModel(null) ,new ReceptorMapper());
		return list;
	}

	public boolean addReceptor(ReceptorDTO receptorDTO) {
		String sql = " INSERT INTO clientes(idclientes,razonsocial,rfc,estado,website,telefonos,rfcEmpresa,tipo,calle,numeroe,colonia,municipio,cp,email,cc,numeroi,respresentantelegal,regimenfiscal,numctapago)"
				+ " VALUES(:idclientes,:razonsocial,:rfc,:estado,:website,:telefonos,:rfcEmpresa,:tipo,:calle,:numeroe,:colonia,:municipio,:cp,:email,:cc,:numeroi,:respresentantelegal,:regimenfiscal,:numctapago)";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(receptorDTO));
		return false;
	}

	public boolean updateReceptor(ReceptorDTO receptorDTO) {
		 String Sql = "update clientes set "
		 		+ "idclientes = :idclientes,"
		 		+ "razonsocial = :razonsocial,"
		 		+ "rfc= :rfc,"
		 		+ "estado = :estado,"
		 		+ "website = :website,"
		 		+ "telefonos = :telefonos,"
		 		+ "rfcEmpresa = :rfcEmpresa,"
		 		+ "tipo = :tipo,"
		 		+ "calle = :calle,"
		 		+ "numeroe = :numeroe,"
		 		+ "colonia = :colonia,"
		 		+ "municipio = ;municipio,"
		 		+ "cp= :cp,"
		 		+ "email= :email,"
		 		+ "cc = :cc,"
		 		+ "numeroi = :numeroi,"
		 		+ "respresentantelegal = :respresentantelegal,"
		 		+ "regimenfiscal = :regimenfiscal,"
		 		+ "numctapago = :numctapago ";
		 
		 namedParameterJdbcTemplate.update(Sql, getSqlParameterByModel(receptorDTO));
			return false;
	}

	public boolean deleteReceptor(int idreceptor) {
		String Sql = "delete from clientes where idclientes = :id";
		namedParameterJdbcTemplate.update(Sql, getSqlParameterByModel(new ReceptorDTO(idreceptor)));
		return false;
	}

	public ReceptorDTO findReceptorById(int idReceptor) {
		String Sql = "select * from clientes where idclientes = :id";
		return namedParameterJdbcTemplate.queryForObject(Sql, getSqlParameterByModel(new ReceptorDTO(idReceptor)),new ReceptorMapper());
	}
	
	private SqlParameterSource getSqlParameterByModel(ReceptorDTO receptorDTO) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		if(receptorDTO != null) {
			paramSource.addValue("idclientes", receptorDTO.getIdclientes());
			paramSource.addValue("razonsocial", receptorDTO.getRazonsocial());
			paramSource.addValue("rfc", receptorDTO.getRfc());
			paramSource.addValue("estado", receptorDTO.getEstado());
			paramSource.addValue("website", receptorDTO.getWebsite());
			paramSource.addValue("telefonos", receptorDTO.getTelefonos());
			paramSource.addValue("rfcEmpresa", receptorDTO.getRfcEmpresa());
			paramSource.addValue("tipo", receptorDTO.getTipo());
			paramSource.addValue("calle", receptorDTO.getCalle());
			paramSource.addValue("numeroe", receptorDTO.getNumeroe());
			paramSource.addValue("colonia", receptorDTO.getColonia());
			paramSource.addValue("municipio", receptorDTO.getMunicipio());
			paramSource.addValue("cp", receptorDTO.getCp());
			paramSource.addValue("email", receptorDTO.getEmail());
			paramSource.addValue("cc", receptorDTO.getCc());
			paramSource.addValue("numeroi", receptorDTO.getNumeroi());
			paramSource.addValue("respresentantelegal", receptorDTO.getRespresentantelegal());
			paramSource.addValue("regimenfiscal", receptorDTO.getRegimenfiscal());
			paramSource.addValue("numctapago", receptorDTO.getNumctapago());
		}
		return paramSource;
	}
	
	private static final class ReceptorMapper implements RowMapper<ReceptorDTO>{

		public ReceptorDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			ReceptorDTO receptorDTO = new ReceptorDTO();
			receptorDTO.setIdclientes(rs.getInt("idclientes"));
			receptorDTO.setRazonsocial(rs.getString("razonsocial"));
			receptorDTO.setRfc(rs.getString("rfc"));
			receptorDTO.setEstado(rs.getString("estado"));
			receptorDTO.setWebsite(rs.getString("website"));
			receptorDTO.setTelefonos(rs.getString("telefonos"));
			receptorDTO.setRfcEmpresa(rs.getString("rfcEmpresa"));
			receptorDTO.setTipo(rs.getString("tipo"));
			receptorDTO.setCalle(rs.getString("calle"));
			receptorDTO.setNumeroe(rs.getString("numeroe"));
			receptorDTO.setColonia(rs.getString("colonia"));
			receptorDTO.setMunicipio(rs.getString("municipio"));
			receptorDTO.setCp(rs.getInt("cp"));
			receptorDTO.setEmail(rs.getString("email"));
			receptorDTO.setCc(rs.getString("cc"));
			receptorDTO.setNumeroi(rs.getString("numeroi"));
			receptorDTO.setRespresentantelegal(rs.getString("respresentantelegal"));
			receptorDTO.setRegimenfiscal(rs.getString("regimenfiscal"));
			receptorDTO.setNumctapago(rs.getString("numctapago"));

			return receptorDTO;
		}
	}

}
