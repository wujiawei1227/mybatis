package com.mybatis.sqlsession;
/*
*
 * @Description //TODO
 * @Param
 * @return
 **/
public interface SqlSessionFactory {
    /*
    *
     * @Description //TODO 用于打开新的sqlsession对象
     * @Param []
     * @return SqlSession
     **/
   public SqlSession openSession();
}
