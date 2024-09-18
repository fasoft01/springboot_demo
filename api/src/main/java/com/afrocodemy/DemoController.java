package com.afrocodemy;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Data
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Demo Controller", description = "Demo Controller")
public class DemoController {

    @GetMapping("/display")
    public ResponseEntity<String>  display() {
        return ResponseEntity.ok("Hello World");
    }
}
