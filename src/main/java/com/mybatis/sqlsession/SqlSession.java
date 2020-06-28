package com.mybatis.sqlsession;

/**
 * @program: Mybatis
 * @description: 自定义mybatis中与数据库交互的核心类
 * @author: wudaren
 * @create: 2020-06-27 19:57
 **/

public interface SqlSession {
    /*
    *
     * @Description //TODO 根据参数创建一个代理对象
     * @Param [daoInterfaceClass]  dao的接口字节码
     * @return T
     **/
    <T> T getMapper(Class<T> daoInterfaceClass);
        /*
        *
         * @Description //TODO 释放资源
         * @Param []
         * @return void
         **/
    void close();
}
