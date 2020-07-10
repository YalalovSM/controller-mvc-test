package ru.sydev.controllermvctest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {
    @GetMapping("/{name}")
    public ResponseEntity<?> byName(@PathVariable String name) {
        return ResponseEntity.ok("Hello, " + name);
    }
}
