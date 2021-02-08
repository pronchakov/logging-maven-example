package edu.logging;

import edu.logging.bl.BL;
import edu.logging.ui.UI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    /*
    * trace
    * debug
    * info
    * warn
    * error
    * fatal
    *
    * */

    public static void main(String[] args) throws InterruptedException {
        log.info("Start program");
        log.debug("Date: '{}'",  new Date());
        log.trace("Nano time: {}", System.nanoTime());

        BL bl = new BL();
        UI ui = new UI();

        log.debug("About to invoke some logic");
        bl.someLogic();

        log.debug("About to show results");
        ui.show();

        log.info("End program");
    }
}
