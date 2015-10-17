package test.week4;


import java.util.Arrays;
import java.util.logging.*;

public class logger {
    private static final Logger LOGGER = Logger.getLogger(logger.class.getName());
    private static Logger loggerA = Logger.getLogger("test.week4.logger");
    private static Logger loggerB = Logger.getLogger("test.week4.logger");

    public static void main(String[] args) {
        LOGGER.log(Level.ALL, "Started with arguments: {0}", Arrays.toString(args));
        logger.configureLogging();
        try {
            randomlyFailingAlgorithm();
        } catch (IllegalStateException e) {

            System.exit(2);
        }
        LOGGER.fine("Finished successfully");
    }

    private static void randomlyFailingAlgorithm(){
        double randomNumber = Math.random();
        System.out.println(loggerA.getLevel());
        loggerA.getHandlers();
        loggerA.getClass();
        if (randomNumber < 0.5) {
            throw new IllegalStateException("Invalid phase of the Moon");
        }

    }

    private static void configureLogging() {
        loggerA.setLevel(Level.ALL);
        loggerB.setLevel(Level.WARNING);
        loggerA.setUseParentHandlers(false);
        loggerB.setUseParentHandlers(false);
        Handler handlerA = new ConsoleHandler();
        Handler handlerB = new ConsoleHandler();
        handlerA.setLevel(Level.ALL);
        handlerB.setLevel(Level.WARNING);
        handlerA.setFormatter(new XMLFormatter());
        handlerB.setFormatter(new XMLFormatter());
        loggerA.addHandler(handlerA);
        loggerB.addHandler(handlerB);


    }
}
