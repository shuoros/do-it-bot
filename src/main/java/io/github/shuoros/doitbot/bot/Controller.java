package io.github.shuoros.doitbot.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final String TELEGRAM;

    public Controller(@Value("${robot.token}") String token) {
        TELEGRAM = "https://api.telegram.org/bot" + token;
    }

    @PostMapping("${robot.token}")
    public ResponseEntity<?> getMessage(@RequestBody String payload) {
        return (ResponseEntity<?>) ResponseEntity.ok();
    }

}
