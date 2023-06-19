package com.juhao666.monitor.schedulers;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;


@Component
@EnableScheduling
public class My1stDemoScheduledTask {

    private static final Logger logger = Logger.getLogger(My1stDemoScheduledTask.class.getName());


    //@Scheduled(cron = "0 0 9 ? * MON-FRI")
    @Scheduled(cron = "0/30 * * ? * MON")
    public void runTask() {
        logger.info("My batch job is starting...");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
        logger.info("My batch job is successfully completed...");
    }
}
