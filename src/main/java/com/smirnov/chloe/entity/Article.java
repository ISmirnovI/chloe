package com.smirnov.chloe.entity;

import javax.persistence.*;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private String headline;

    @Column(length = 4000)
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
