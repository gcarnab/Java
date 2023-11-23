package com.template.gc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The above class is a Java program that prints "Hello World!" to the console.
 */
public class App {

    // use LogManager to get a logger instance
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) throws Exception {

        // Leggiamo il file di properties
        String configFileName = "gc-properties.xml";
        // Specifica il percorso relativo al file di configurazione
        String configFilePathRelative = System.getProperty("user.dir") + "/gc_java_template_mvn/src/main/resources/" + configFileName;
        // Specifica il percorso assoluto al file di configurazione
        String configFilePathAbsolute = "c:\\GCDATA\\DEV\\vscode-workspace\\Java\\gc_java_template_mvn\\src\\main\\resources\\"
                + configFileName;

        logger.info("configFilePathRelative: " + configFilePathRelative);
        logger.info("configFilePathAbsolute: " + configFilePathAbsolute);

        ConfigReader configReader = new ConfigReader(configFilePathRelative);

        // Usiamo i valori del file di properties
        Boolean useLog = Boolean.parseBoolean(configReader.getProperty1());
        String prop2 = configReader.getProperty2();

        // Stampiamo i valori
        logger.info("useLogFlag: " + useLog);
        logger.info("prop2: " + prop2);

        // Esegui il log di diversi livelli
        logger.trace("Messaggio di trace");
        logger.debug("Messaggio di debug");
        logger.info("Messaggio di info");
        logger.warn("Messaggio di warning");
        logger.error("Messaggio di errore");
        logger.fatal("Messaggio di fatal");

        System.out.println("Hello World!");
        // Esempio di utilizzo di variabili nel log
        String name = "World";
        logger.info("Hello, {}", name);
    }
}
