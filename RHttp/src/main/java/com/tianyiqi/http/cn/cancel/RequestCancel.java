package com.tianyiqi.http.cn.cancel;

/**
 * 请求取消接口
 *
 * @author tianyiqi
 */
public interface RequestCancel {

    /**
     * 取消请求
     */
    void cancel();

    /**
     * 请求被取消
     */
    void onCanceled();
}
