package com.mybatis.Annotation;

/*
*
 * @Description //TODO 查询的注解
 * @Param
 * @return
 **/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {
    /*
    *
     * @Description //TODO 配置sql语句
     * @Param []
     * @return java.lang.String
     **/
    String value();
}
