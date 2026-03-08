package com.satya.projects.personal_blogging.restservice;

import org.springframework.web.bind.annotation.RestController;

@RestController
public interface BloggingRestService {

    @Get()
    public Articles listArticles();

}
