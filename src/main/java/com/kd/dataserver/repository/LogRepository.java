package com.kd.dataserver.repository;

import com.kd.dataserver.domain.Log;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/1/2 17:06
 */
@Repository
public interface LogRepository extends ElasticsearchRepository<Log,Long> {
}
