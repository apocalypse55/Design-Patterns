package org.example.singletonpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonCall {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        // Check if both logger instances are the same
        if (logger1 == logger2) {
            log.info("Both logger instances are the same.");
        } else {
            log.info("Logger instances are different.");
        }
        logger1.log("Application started");
        logger1.error("Application run failed");
    }
}
