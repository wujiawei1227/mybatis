package com.mybatis.Utils;

import com.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: Mybatis
 * @description: 用于创建数据源的工具类
 * @author: wudaren
 * @create: 2020-06-27 21:07
 **/

public class DataSourceUtil {
    public  static Connection getConnection(Configuration cfg){
        try {
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(),cfg.getUsername(),cfg.getPassword());
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
    }
}
