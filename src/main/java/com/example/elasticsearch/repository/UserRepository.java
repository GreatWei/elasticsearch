package com.example.elasticsearch.repository;

import com.example.elasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface UserRepository extends ElasticsearchRepository<User,Long> {
    long deleteByLastname(String lastname);

    List<User> removeByLastname(String lastname);
}
