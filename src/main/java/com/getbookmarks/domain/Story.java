package com.getbookmarks.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by amarendra on 01/03/16.
 */
@Document(collection = "stories")
public class Story {

    @Id
    private String id;

    private String title;

    private String text;

    private String url;

    private String fullname;

    private final Date submittedOn = new Date();

    private String image;

    public Story() {
    }

    public Story(Story input, Story extraInformation) {
        this.url = input.getUrl();
        this.fullname = input.getFullname();
        this.title = extraInformation.getTitle();
        this.text = extraInformation.getText();
        this.image = extraInformation.getImage();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getSubmittedOn() {
        return submittedOn;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
