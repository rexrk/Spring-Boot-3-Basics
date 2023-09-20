package com.raman.springbootlearn.controller;
import com.raman.springbootlearn.domain.RestData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestDataController {

    @RequestMapping("/restate")
    public List<RestData> getRestData() {
        return List.of(
                new RestData(1, "Raman", 24),
                new RestData(2, "Raze", 12),
                new RestData(3, "deadlock", 18),
                new RestData(4, "sage", 35),
                new RestData(5, "phoenix", 36),
                new RestData(6, "omen", 27)
        );
    }

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "<h1>Hello " + name.toUpperCase() + "</h1>";
    }

}