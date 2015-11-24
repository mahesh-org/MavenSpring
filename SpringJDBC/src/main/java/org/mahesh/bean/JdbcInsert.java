package org.mahesh.bean;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Maheshwar Muttal on 11/5/2015.
 * update()  - non-select operation. This is suitable for DML[non-select] operations. The retun type of this method is int.
 * It accepts both static and dynamic sql commands.
 * Ex: int k = jt.update(” insert into table_name values(100,’java4s’) “);
 * int k = jt.update(” insert into table_name values(?,?) “, values);
 *
 */
public class JdbcInsert {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertRecord() {
        System.out.println("\nJdbcInsert - InsertRecord called... ");
        int result = jdbcTemplate.update("Insert into JdbcTest values(1, 'Mahesh')");
        System.out.println("JdbcInsert - result:"+result);
    }
}
