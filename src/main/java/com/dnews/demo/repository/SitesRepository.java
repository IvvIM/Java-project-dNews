package com.dnews.demo.repository;

import com.dnews.demo.domain.News;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SitesRepository extends MongoRepository<News, ObjectId> {
}
