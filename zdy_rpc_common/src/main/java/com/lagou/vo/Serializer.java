package com.lagou.vo;

import java.io.IOException;

public interface Serializer {

    /**
     * java对象转换为二进制
     * @param object
     * @return
     * @throws IOException
     */
    byte[] serialize(Object object) throws IOException;


    /**
     * 二进制转换成java对象
     * @param clazz
     * @param bytes
     * @param <T>
     * @return
     * @throws IOException
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes) throws IOException;
}
