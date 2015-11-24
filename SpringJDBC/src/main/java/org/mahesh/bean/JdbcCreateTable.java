package org.mahesh.bean;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Maheshwar Muttal on 11/4/2015.
 * execute() - non-select operation. The return type of this method is void. Hence its not good for DML(insert/update/delete) operations.
 * It can only execute static queries.
 */
public class JdbcCreateTable {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createTable() {
        System.out.println("Before the table creation...");
        jdbcTemplate.execute("Drop table JdbcTest");
        System.out.println("Table Dropped...");
        jdbcTemplate.execute("Create table JdbcTest(SNO INTEGER, NAME VARCHAR(10))");
        System.out.println("Table Created...");
    }

    public void display(){
        System.out.println("Woooow its working.....");
    }
}
