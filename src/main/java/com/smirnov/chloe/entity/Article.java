package com.smirnov.chloe.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private String headline;

    private String content;

    private String previewContent;

    public String getPreviewContent() {return previewContent; }

    public void setPreviewContent(String previewContent){
        this.previewContent = previewContent;
    }

    public String getContent() {return content; }

    public void setContent(String content){
        this.content = content;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadline(){
        return headline;
    }

    public void setHeadline(String headline){
        this.headline = headline;
    }
}
