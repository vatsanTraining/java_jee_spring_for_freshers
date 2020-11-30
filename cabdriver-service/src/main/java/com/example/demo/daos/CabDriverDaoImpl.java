package com.example.demo.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CabDriver;
import com.example.demo.ifaces.DataAccess;

@Repository
public class CabDriverDaoImpl implements DataAccess<CabDriver> {

	@Autowired
	private JdbcTemplate template;
		
	@Override
	public int add(CabDriver t) {
		
		String sql = "insert into taxidriver values(?,?,?,?)";
		
		return this.template.update(sql,
				    t.getId(),t.getDriverName(),
				    t.getAddress(),t.getRating()
				 );
	}

	@Override
	public List<CabDriver> findAll() {

		String sql = "select * from taxidriver";
		
		 
		    
		return this.template.query(sql,new BeanPropertyRowMapper<CabDriver>(CabDriver.class));
	}

	
	
}
