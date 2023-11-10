package com.example.SpeakClock;

import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.function.Function;

@Service
public class SpeakClockService {

    public String getCurrentTimeInWords() {
        LocalTime currentTime = LocalTime.now();
        Function<LocalTime, String> toSpeakingClock = localTime -> {
        	
        	
            if (localTime.getHour() == 0) {
                return "midnight";
            }
            else if (localTime.getHour() == 12 && localTime.getMinute() == 00) {
                return "noon";
            }
            else if (localTime.getHour() == 10 && localTime.getMinute() == 00){
                
                return "The time is Ten clock";
            }
            
            return String.format("%d:%02d", localTime.getHour(), localTime.getMinute());
        };

       
        String timeInWords = toSpeakingClock.apply(currentTime);
        System.out.println(timeInWords);

        return timeInWords;
    }
}