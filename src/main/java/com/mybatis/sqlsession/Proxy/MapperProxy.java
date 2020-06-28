package com.mybatis.sqlsession.Proxy;

import com.mybatis.Utils.Executor;
import com.mybatis.cfg.Mapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @program: Mybatis
 * @description:
 * @author: wudaren
 * @create: 2020-06-27 20:43
 **/

public class MapperProxy implements InvocationHandler {
    //Map的key是全限定类名+方法
    private Map<String,Mapper> mappers;
    private Connection connection;

    public MapperProxy(Map<String, Mapper> mappers,Connection connection) {
                this.mappers=mappers;
                this.connection=connection;
    }
/*
*
 * @Description //TODO 用于对方法进行增强，就是调用selectlist方法
 * @Param [proxy, method, args]
 * @return java.lang.Object
 **/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //获取方法名
        String methodName=method.getName();
        //获取方法所在类的名称
        String className=method.getDeclaringClass().getName();
        //组合key
        String key=className+"."+methodName;
        //获取Mappers中的mapper对象
        Mapper mapper=mappers.get(key);
        //判断是否有mapper
        if (mapper==null)
        {
            throw new IllegalArgumentException("传入参数有误");
        }
        //调用工具类执行查询
        return new Executor().selectList(mapper,connection);
    }
}
