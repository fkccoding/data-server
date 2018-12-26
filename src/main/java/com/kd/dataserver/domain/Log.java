package com.kd.dataserver.domain;

//import lombok.Data;

import lombok.Data;

import java.util.Date;

/**
 * @Author: www.chuckfang.top
 * @Date: 2018/12/24 15:35
 */
@Data
public class Log {
    private Date time;
    private String ip;
    private String type;
    private String username;
    private String id;
    private String team;
    private String cd;
}
