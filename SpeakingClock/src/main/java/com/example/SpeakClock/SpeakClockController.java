package com.example.SpeakClock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SpeakClockController {


    @Autowired
    private SpeakClockService speakingClockService;

    @GetMapping("/current-time")
    public ResponseEntity<String> getCurrentTimeInWords() {
        String timeInWords = speakingClockService.getCurrentTimeInWords();
        return new ResponseEntity<>(timeInWords, HttpStatus.OK);
    }

}