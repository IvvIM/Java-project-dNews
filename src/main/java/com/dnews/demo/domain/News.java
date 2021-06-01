package com.dnews.demo.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "News")
public class News {

    @Id
    private ObjectId id = new ObjectId();
    private String url;
    private String photoURL;
    private String title;
    private String description;

    public News() {}

    public News(String url, String photoURL, String title, String description)
    {
        this.url = url;
        this.photoURL = photoURL;
        this.title = title;
        this.description = description;
    }

    public ObjectId getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
