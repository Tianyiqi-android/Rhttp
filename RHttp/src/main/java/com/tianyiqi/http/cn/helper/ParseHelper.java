package com.tianyiqi.http.cn.helper;

/**
 * 数据解析helper
 *
 * @author tianyiqi
 */
public interface ParseHelper<T> {
    /*解析数据*/
    T parse(String data);
}
