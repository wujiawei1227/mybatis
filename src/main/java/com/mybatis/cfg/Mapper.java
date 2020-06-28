package com.mybatis.cfg;

/**
 * @program: Mybatis
 * @description: 用于封装执行的sql语句和全限定类名
 * @author: wudaren
 * @create: 2020-06-27 20:22
 **/

public class Mapper {
    private  String queryString;//sql
    private String resultType;//实体类的全限定类名

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
