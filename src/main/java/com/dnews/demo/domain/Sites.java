package com.dnews.demo.domain;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Sites")
public class Sites {
    @Id
    private ObjectId id = new ObjectId();
    private String url;
    private String photoURLTag;
    private String titleTag;
    private String descriptionTag;

    public Sites() {}

    public Sites (String url, String photoURLTag, String titleTag, String descriptionTag)
    {
        this.url = url;
        this.photoURLTag = photoURLTag;
        this.titleTag = titleTag;
        this.descriptionTag = descriptionTag;
    }

    public ObjectId getId() { return id; }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }

    public String getPhotoURLTag() { return photoURLTag; }

    public void setPhotoURLTag(String photoTag) { this.photoURLTag = photoTag; }

    public String getTitleTag() { return titleTag; }

    public void setTitleTag(String titleTag) { this.titleTag = titleTag; }

    public String getDescriptionTag() { return descriptionTag; }

    public void setDescriptionTag(String descriptionTag) { this.descriptionTag = descriptionTag; }
}
