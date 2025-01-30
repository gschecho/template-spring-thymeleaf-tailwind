package com.app.thymeleaftailwind.models;


import java.time.LocalDateTime;


public class Project {


   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(nullable = false)
    private Long id;

    private String name;
    private String description;
    private String client;
    private String image;

    private String location;
    private LocalDateTime createdAt;

}
