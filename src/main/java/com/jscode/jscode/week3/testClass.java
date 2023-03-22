package com.jscode.jscode.week3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class testClass {
    @GetMapping("/api/user")
    public User returnUser()
    {
        User user = new User("Junhyuk", 20, "man");
        log.info(String.valueOf(user));
        return user;
    }

    @GetMapping("/api/string")
    public String returnString()
    {
        return "HiBro";
    }

    @GetMapping("/api")
    public String returnNameParam(@RequestParam String name)
    {
        return name;
    }

    @GetMapping("/api/{name}")
    public String returnNamePath(@PathVariable String name)
    {
        return name;
    }
}
