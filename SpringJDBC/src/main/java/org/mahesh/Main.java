package org.mahesh;

import org.mahesh.bean.JdbcCreateTable;
import org.mahesh.bean.JdbcInsert;
import org.mahesh.bean.JdbcSelect;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Maheshwar Muttal on 11/4/2015.
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        PropertyPlaceholderConfigurer placeholderConfigurer = new PropertyPlaceholderConfigurer();
        placeholderConfigurer.setLocation(new ClassPathResource("jdbcBundle.properties"));


        JdbcCreateTable jdbcCreateTableUsingExecute = (JdbcCreateTable) context.getBean("jdbcCreateTable");
        jdbcCreateTableUsingExecute.createTable();

        JdbcInsert jdbcInsert = (JdbcInsert) context.getBean("jdbcInsert");
        jdbcInsert.insertRecord();

        JdbcSelect jdbcSelect = (JdbcSelect) context.getBean("jdbcSelect");
        jdbcSelect.selectQuery();
        jdbcSelect.updateQuery();
        jdbcSelect.selectQuery();

    }
}
