package com.pasindu.stream;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.UUID;

public class UuidExample {
    public static void main(String[] args) {
        UUID uniqueKey = UUID.randomUUID();
        LocalDateTime dateTime= LocalDateTime.now();
        String code = "INV"+dateTime.getYear()+dateTime.getMonthValue()
                +dateTime.getDayOfYear()
                +dateTime.getHour()
                +dateTime.getMinute()
                +dateTime.getSecond()
                +dateTime.getNano();

        String lUUID = String.format("%d", new BigInteger(UUID.randomUUID().toString().replace("-", ""), 16));

//        UUID uniqueKey1 = UUID.fromString("pasindu");

        System.out.println(code);
//        System.out.println(lUUID);
//        System.out.println(uniqueKey.toString());
//        System.out.println(uniqueKey.version());
//        System.out.println(uniqueKey.hashCode());
//        System.out.println(uniqueKey1.toString());
    }
}
