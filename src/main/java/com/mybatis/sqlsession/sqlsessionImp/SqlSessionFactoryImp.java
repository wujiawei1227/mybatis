package com.mybatis.sqlsession.sqlsessionImp;

import com.mybatis.cfg.Configuration;
import com.mybatis.sqlsession.SqlSession;
import com.mybatis.sqlsession.SqlSessionFactory;

/**
 * @program: Mybatis
 * @description:sqlsessionfactory 接口实现类
 * @author: wudaren
 * @create: 2020-06-27 20:33
 **/

public class SqlSessionFactoryImp  implements SqlSessionFactory {
   private Configuration cfg;

    public SqlSessionFactoryImp(Configuration cfg) {
        this.cfg = cfg;
    }

    /*
   *
    * @Description //TODO 用于创建一个新的操作数据库的对象
    * @Param []
    * @return com.mybatis.sqlsession.SqlSession
    **/
    public SqlSession openSession() {
        return new SqlSessionImp(cfg);
    }
}
