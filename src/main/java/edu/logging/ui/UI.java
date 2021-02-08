package edu.logging.ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UI {

    private static final Logger log = LogManager.getLogger(UI.class);


    public void show() {
        log.trace("begin show");

        log.info("Show some data to user");

        log.trace("end show");
    }
}
