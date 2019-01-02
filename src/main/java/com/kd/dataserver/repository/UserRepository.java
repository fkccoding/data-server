package com.kd.dataserver.repository;

import com.kd.dataserver.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/1/2 17:14
 */
public interface UserRepository extends ElasticsearchRepository<User, Long> {
}
