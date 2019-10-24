package com.sparta.wla.manager;

import org.apache.log4j.Logger;

public class LoggingManager {

    private String message;
    private Logger log = Logger.getLogger(LoggingManager.class);

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        log.debug("Message set");
    }

    public void displayMessage(){
        System.out.println(message);
        log.debug("Message Printed - " + message);
    }


}
