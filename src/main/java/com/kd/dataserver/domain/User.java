package com.kd.dataserver.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;


/**
 * @Author: www.chuckfang.top
 * @Date: 2018/12/26 13:58
 */
@Data
//@Document(indexName = "users")//indexName不是相当于数据库吗，为什么不能一个数据库中有多张表呢?
//答案：在6.0.0以后不用type了
public class User implements Serializable {
    private Long id;//这里为什么必须是id
    private String username;
    private String company;
}
