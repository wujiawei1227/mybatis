package com.mybatis.sqlsession;

import com.mybatis.Utils.XMLConfigBuilder;
import com.mybatis.cfg.Configuration;
import com.mybatis.sqlsession.sqlsessionImp.SqlSessionFactoryImp;

import java.io.InputStream;

/**
 * @program: Mybatis
 * @description: 用于创建一个sqlsessionfactory对象
 * @author: wudaren
 * @create: 2020-06-27 19:52
 **/

public class SqlSessionFactoryBuilder {

    /*
    *
     * @Description //TODO 根据参数的字节输入流构建一个sqlsessionFactory
     * @Param [config]
     * @return com.mybatis.sqlsession.SqlSessionFactory
     **/
    public SqlSessionFactory build(InputStream config){
        Configuration cfg= XMLConfigBuilder.loadConfiguration(config);

        return new SqlSessionFactoryImp(cfg);
    }
}
