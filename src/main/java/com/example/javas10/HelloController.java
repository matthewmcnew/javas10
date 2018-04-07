package com.example.javas10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    var hi = List.of("hi", "how", "are", "you", "java 10");

    var collect = List.copyOf(hi)
      .stream()
      .collect(Collectors.toUnmodifiableList());

    return String.join(" ", hi);
  }

}
