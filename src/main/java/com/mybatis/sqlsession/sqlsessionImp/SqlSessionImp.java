package com.mybatis.sqlsession.sqlsessionImp;

import com.mybatis.Utils.DataSourceUtil;
import com.mybatis.cfg.Configuration;
import com.mybatis.sqlsession.Proxy.MapperProxy;
import com.mybatis.sqlsession.SqlSession;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: Mybatis
 * @description:
 * @author: wudaren
 * @create: 2020-06-27 20:37
 **/

public class SqlSessionImp implements SqlSession {
    private Configuration cfg;
    private Connection connection;

    public SqlSessionImp(Configuration cfg ){
        this.cfg = cfg;
        connection= DataSourceUtil.getConnection(cfg);
    }

    /*
    *
     * @Description //TODO 用于创建代理对象
     * @Param [daoInterfaceClass]
     * @return T
     **/
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},new MapperProxy(cfg.getMappers(),connection));


    }
/*
*
 * @Description //TODO 用于释放资源
 * @Param []
 * @return void
 **/
    public void close() {
        if (connection!=null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
