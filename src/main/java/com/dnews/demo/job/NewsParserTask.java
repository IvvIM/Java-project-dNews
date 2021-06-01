package com.dnews.demo.job;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.dnews.demo.service.NewsService;
import com.dnews.demo.domain.News;

@Component
public class NewsParserTask {

    @Autowired
    NewsService nService;

    @Scheduled(fixedDelay = 10000)
    public void parseNews() {
        String url = "https://news.ycombinator.com/";

        try {
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla")
                    .timeout(5000)
                    .referrer("https://google.com")
                    .get();
            Elements news = doc.getElementsByClass("storylink");
            for (Element el: news) {
                String title = el.ownText();
                    News obj = new News();
                    obj.setTitle(title);
                    nService.save(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
