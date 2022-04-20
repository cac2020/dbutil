package com.wjy.dbutil.config;

import lombok.Data;

@Data
public class DataSourceConfig {
    /**
     * 主机名
     */
    private String hostName;
    /**
     * 端口号
     */
    private int port;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}