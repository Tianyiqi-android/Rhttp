package com.tianyiqi.http.cn.load.download;


/**
 * 下载回调接口
 *
 * @author tianyiqi
 */
public interface DownloadProgressCallback {

    /**
     * 下载进度回调
     *
     * @param currentSize 当前值
     * @param totalSize   总大小
     */
    void progress(long currentSize, long totalSize);

}
