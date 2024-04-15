package gc.crud.gc_crud_thymeleaf.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    // Get the SLF4J logger interface, default Logback, a SLF4J implementation
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String hello() {

        // log to console (default)

        logger.debug("Debug level - Hello Logback");

        logger.info("Info level - Hello Logback");

        logger.error("Error level - Hello Logback");

        return "LOGGING WITH SLF4J... See Console!";
    }

    // Log with variable
    @GetMapping("/log/{name}")
    String find(@PathVariable String name) {

        logger.debug("Debug level - Hello Logback {}", name);

        logger.info("Info level - Hello Logback {}", name);

        logger.error("Error level - Hello Logback {}", name);

        return "LOGGING WITH SLF4J Hello  " + name;

    }
}
