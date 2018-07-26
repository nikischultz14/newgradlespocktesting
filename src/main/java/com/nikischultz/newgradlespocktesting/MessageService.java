package com.nikischultz.newgradlespocktesting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService.class);

    public String getMessage() {
        LOGGER.info("Returning message: Hello World!");
        return "Hello World!";
    }
}