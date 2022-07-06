package com.talk.talk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalkApplication.class, args);
    }

}
