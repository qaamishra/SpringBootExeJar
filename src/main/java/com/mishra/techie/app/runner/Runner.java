package com.mishra.techie.app.runner;

import com.mishra.techie.app.commons.ConfigInitialization;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ashutosh on 20-11-2016.
 */

@Component
public class Runner {

    private final Logger logger= LoggerFactory.getLogger(Runner.class);
    @Autowired
    ConfigInitialization configInitialization;

    public void startMyApplication(){

        String uname=configInitialization.DB_USER;
        String pass=configInitialization.DB_PASS;

        logger.info(uname);;
        logger.info(pass);


    }
}
