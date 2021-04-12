package com.dnews.demo.repository;

import com.dnews.demo.domain.NewsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends MongoRepository<NewsEntity, Long> {
}
