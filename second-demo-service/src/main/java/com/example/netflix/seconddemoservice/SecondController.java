/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.netflix.seconddemoservice;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author novax00
 */
@RestController
public class SecondController {

    @GetMapping("/api/v1/hello")
    public Map<String, String> hello(@RequestHeader(name = "name", required = false, defaultValue = "none") String name) {
        Map<String, String> map = new HashMap<>();
        map.put("hello2", name);
        return map;
    }
}
