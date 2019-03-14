package com.ttn;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Map;

public class JdbcTemplateExample {

    DataSource dataSource;

    JdbcTemplate jdbcTemplate;

    void userCount() {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(sql, Integer.class));
    }

    public void retrieveMultipleRowsColumns() {
        //queryForMap method is preferred for single row outputs, for multiple row outputs use queryForList
        jdbcTemplate = new JdbcTemplate(dataSource);
        Map<String, Object> row = jdbcTemplate.queryForMap("select * from user");
        System.out.println(row);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
