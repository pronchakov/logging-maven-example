package edu.logging.bl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BL {

    private static final Logger log = LogManager.getLogger(BL.class);

    public void someLogic() {
        long startTime = System.currentTimeMillis();
        log.trace("begin someLogic");

        log.info("doing some logic");
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("done doing some logic");

        long endTime = System.currentTimeMillis();
        log.trace("end someLogic. Time to invoke: {}ms", endTime - startTime);
    }
}
