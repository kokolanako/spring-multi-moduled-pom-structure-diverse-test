package com.kokolanako;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {
         //pay attention to the case of letters in the pattern
        System.out.println(LocalDateTime.parse("23.04.2019 13:28:00",DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")));
    }
}
