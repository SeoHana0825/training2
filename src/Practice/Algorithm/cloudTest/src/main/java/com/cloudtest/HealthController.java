package com.cloudtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class HealthController {

    @GetMapping("/log")
    public Health health() {
        String a = "hello";
        log.info("포맷팅 지원확인 {}", a);           // INFO 레벨

        return new Health(
                "UP",
                LocalDateTime.now().toString()
        );
    }
}
