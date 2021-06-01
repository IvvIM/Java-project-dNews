package com.dnews.demo.service;

import com.dnews.demo.domain.News;
import com.dnews.demo.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    public NewsRepository repo;

    public List<News> getAllNews()
    {
        return repo.findAll();
    }

    public void save(News news) {
        repo.save(news);
    }
}
