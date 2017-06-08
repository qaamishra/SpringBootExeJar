package com.mishra.techie.app;

import com.mishra.techie.app.runner.Runner;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprintBootUtilityExecutableJarApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SprintBootUtilityExecutableJarApplication.class, args);

		Runner runner=ctx.getBean(Runner.class);
		runner.startMyApplication();
	}
}
