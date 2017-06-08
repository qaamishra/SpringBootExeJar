package com.mishra.techie.app.commons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Ashutosh on 20-11-2016.
 */

@Component
public class ConfigInitialization {

    @Value("${database.username}")
    public String DB_USER;

    @Value("${database.password}")
    public String DB_PASS;


}
