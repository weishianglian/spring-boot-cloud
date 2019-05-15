package me.wslian.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class CloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }

    @RestController
    class SimpleController {

        @GetMapping("/hello")
        public Map hello() {
            Map<String, String> map = new HashMap<>();
            map.put("say", "Hello!");
            return map;
        }
    }
}
