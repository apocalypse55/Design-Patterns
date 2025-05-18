package org.example.singletonpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logger {
    private Logger() {
        log.info("Logger initialized");
    }

    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

    public void log(String message) {
        log.info(message);
    }

    public void error(String message) {
        log.error(message);
    }
}
