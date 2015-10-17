package test.week4;


import java.util.Arrays;
import java.util.logging.*;

public class logger {
    private static final Logger LOGGER = Logger.getLogger(logger.class.getName());
    private static Logger loggerA = Logger.getLogger("test.week4.logger");


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

        loggerA.getHandlers();
        loggerA.getClass();
        if (randomNumber < 0.5) {
            throw new IllegalStateException("Invalid phase of the Moon");
        }

    }

    private static void configureLogging() {
        Handler handlerA = new ConsoleHandler();
        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        Logger loggerC = Logger.getLogger("org.stepic.java");
        loggerC.addHandler(handlerA);


        loggerC.setLevel(Level.ALL);
        loggerA.setLevel(Level.ALL);
        loggerB.setLevel(Level.WARNING);
        loggerC.setUseParentHandlers(false);
        handlerA.setLevel(Level.ALL);

        handlerA.setFormatter(new XMLFormatter());



    }
}
