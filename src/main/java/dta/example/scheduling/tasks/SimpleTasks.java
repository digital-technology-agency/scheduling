package dta.example.scheduling.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class SimpleTasks {

    Logger logger = Logger.getLogger("SimpleTasks");


    //@Scheduled(fixedRate = 5000)
    @Scheduled(cron = "${test.schedulling}")
    public void Simple() {
        logger.info("Run simple task");
    }

}
