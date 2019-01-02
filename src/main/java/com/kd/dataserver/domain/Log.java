package com.kd.dataserver.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: www.chuckfang.top
 * @Date: 2018/12/24 15:35
 */
@Data
@Document(indexName = "logs",type = "log")
public class Log implements Serializable {
    private Long id;
    private String level;
    private String type;
    private String msg;
    private Date time;
    private String ip;
    private User user;
}
