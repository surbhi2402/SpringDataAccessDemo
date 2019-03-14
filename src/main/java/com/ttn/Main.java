package com.ttn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        /*Exercise 1
        UserDAO userDAO = (UserDAO) ctx.getBean("userDAO", UserDAO.class);
        userDAO.printUserNames();*/

        /*JdbcTemplateExample
        JdbcTemplateExample jdbcTemplateExample = (JdbcTemplateExample) ctx.getBean("jdbcTemplateExample", JdbcTemplateExample.class);
        jdbcTemplateExample.userCount();*/

        //JdbcTemplate QueryForMap Example
        JdbcTemplateExample jdbcTemplateExample = (JdbcTemplateExample) ctx.getBean("jdbcTemplateExample", JdbcTemplateExample.class);
        jdbcTemplateExample.retrieveMultipleRowsColumns();

    }
}
