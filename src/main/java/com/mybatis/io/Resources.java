package com.mybatis.io;

import java.io.InputStream;

/**
 * @program: Mybatis
 * @description: 使用类加载器读取配置文件
 * @author: wudaren
 * @create: 2020-06-27 19:39
 **/

public class Resources {
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);

    }
}
