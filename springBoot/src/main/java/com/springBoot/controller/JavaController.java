package com.springBoot.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {

    @RequestMapping("/")
    public Map<String, Object> getMap() {

        // HashMap<String, Object> hashMap = new HashMap<>();
        Map<String, Object> map = new HashMap<>();
        map.put("code", "Java Developer");
        map.put("list", Arrays.asList("Java", "Spring boot", "Microservice"));
        map.put("ctc", 1600000);

        return map;
    }
}
