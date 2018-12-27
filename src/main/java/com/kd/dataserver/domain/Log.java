package com.kd.dataserver.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author: www.chuckfang.top
 * @Date: 2018/12/24 15:35
 */
@Data
public class Log {
    private Integer logId;
    private String level;
    private String type;
    private String msg;
    private Date time;
    private String ip;
    private User user;
}
