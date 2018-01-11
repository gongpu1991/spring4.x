package com.smart.dao;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
    //1.不使用mybatis
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public int addUser(User user){
        String sql="insert into user(user_name,credits,password,last_visit,last_ip)values('gongpu',1,'123456',new DATE(),'127.0.0.1')";
        jdbcTemplate.execute(sql);
        return 0;
    }
}