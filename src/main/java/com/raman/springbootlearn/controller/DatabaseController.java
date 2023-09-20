package com.raman.springbootlearn.controller;

import com.raman.springbootlearn.domain.DatabaseConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DatabaseController {

    private final DatabaseConfiguration databaseConfiguration;

    public DatabaseController(DatabaseConfiguration databaseConfiguration) {
        this.databaseConfiguration = databaseConfiguration;
    }

    @RequestMapping(value = "/db-config")
    public DatabaseConfiguration hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return databaseConfiguration;
    }

}