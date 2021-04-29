package com.developer.dao;

import com.developer.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class SalesDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Sale> list(){

        String sql="SELECT * FROM SALES";
        List<Sale> listasale=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Sale.class));
        return listasale;
    }
    public void sale(Sale sale){

    }
    public Sale get(int id){
      return null;
    }
    public void update(Sale sale){

    }
    public void delete(int id){

    }


}
