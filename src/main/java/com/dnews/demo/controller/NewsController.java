package com.dnews.demo.controller;

import com.dnews.demo.domain.NewsEntity;
import com.dnews.demo.repository.NewsRepository;
import com.dnews.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsService nService;

    @GetMapping(value = "/getAll")
    public List<NewsEntity> getAll()
    {
        return nService.getAllNews();
    }

}
