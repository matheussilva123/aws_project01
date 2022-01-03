package br.com.siecola.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable final String name) {
        LOG.info("Test controller - name: {}", name);

        return ResponseEntity.ok("Name: " + name);
    }

    @PostMapping("/dog/create/{name}")
    public ResponseEntity<?> dogCreate(@PathVariable final String name) {
        LOG.info("Test controller POST - name: {}", name);

        Map<String, String> dogMap = new HashMap<>();

        dogMap.put("DOG", name.toString());

        return ResponseEntity.ok(dogMap);
    }

}
