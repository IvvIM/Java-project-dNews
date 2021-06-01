package com.dnews.demo.controller;

import com.dnews.demo.domain.News;
import com.dnews.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsController {

    @Autowired
    NewsService nService;

    @GetMapping(value = "/getAll")
    public List<News> getAll()
    {
        return nService.getAllNews();
    }

}
