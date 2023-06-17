package dev.knowledgecafe.virtual_threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class HomeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeService.class);
    //This method will add delay in execution and return name of thread
    public String getResponse(){
        //Adding sleep
        int sleepTime = 250 ; //new Random().nextInt(1000); -- Uncomment the line if you want to add random delay

        try {
            TimeUnit.MILLISECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            LOGGER.error( e.getMessage());
        }
        return "Current Thread Name: " + Thread.currentThread().toString();
    }
}
