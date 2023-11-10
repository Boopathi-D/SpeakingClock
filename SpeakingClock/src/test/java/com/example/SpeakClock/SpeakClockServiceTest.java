package com.example.SpeakClock;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class SpeakClockServiceTest {

    @MockBean
    private SpeakClockService speakClockService;
    @Autowired
    private Mock mockmvc;

    @Test
    public void testGetCurrentTimeInWords() {
       
        LocalTime mockTime = LocalTime.of(10,30);
        SpeakClockService speakClockServiceSpy = Mockito.spy(speakClockService);
        when(speakClockServiceSpy.getCurrentTimeInWords()).thenReturn(mockTime);

      
        String result = speakClockServiceSpy.getCurrentTimeInWords();
        assertEquals("10:30", result);
    }
}
