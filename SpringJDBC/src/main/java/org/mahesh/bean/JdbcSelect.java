package org.mahesh.bean;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Maheshwar Muttal on 11/5/2015.
 *
 * query()   - select operation.
 */
public class JdbcSelect {
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void selectQuery() {
        System.out.println("\nSelect Query called..");
        List list = jdbcTemplate.queryForList("select * from JdbcTest");
        System.out.println("Size: "+ list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("JdbcTest: "+iterator.next());
        }
        System.out.println("End of Select Query..");
    }

    public void updateQuery() {
        System.out.println("\nUpdateQuery called...");
        int resutl = jdbcTemplate.update("Update JdbcTest set name='muttal'");
        System.out.println("Updated. result: " + resutl);
    }
}
