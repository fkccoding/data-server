package com.kd.dataserver.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: www.chuckfang.top
 * @Date: 2018/12/24 15:35
 */
@Data
//@Document(indexName = "logs")//用elastricsearch需要id属性
public class Log implements Serializable {
    private Long id;
    private String level;
    private String type;
    private String msg;
    private Timestamp time;
    private String ip;
    private User user;
}
