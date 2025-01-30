package com.app.thymeleaftailwind.models;


import java.time.LocalDateTime;


public class Post {

   // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(nullable = false)
    private Long id;

    private String title;
    private String subtitle;
    private String content;
    private String author;
    private String imageUrl;
    private String category;
    private String tags;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private LocalDateTime publishedAt;
    private LocalDateTime publishedBy;
    private LocalDateTime publishedOn;
    private LocalDateTime updatedOn;
    private LocalDateTime deletedOn;

}
