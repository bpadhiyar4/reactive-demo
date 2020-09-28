package com.demoreactive.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.LocalDateTime;

@RestController
public class DemoController {

    @GetMapping(value = "/demo/{name}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Demo> getFlux(@PathVariable String name) {
        return Flux.interval(Duration.ofSeconds(1))
                .map(m -> new Demo(1, LocalDateTime.now(), name));
    }
}
