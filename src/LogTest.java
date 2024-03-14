// Listing 8-1

import divFiles.BasicConfigurator;
import divFiles.ConsoleAppender;
import divFiles.Logger;
import divFiles.PatternLayout;
import org.junit.Test;


public class LogTest {
    private Logger logger;

    // Burde være med
    //@Before
    public void initialize() {
        logger = Logger.getLogger("logger");
        logger.removeAllAppenders();
        Logger.getRootLogger().removeAllAppenders();
    }

    @Test
    public void basicLogger() {
        BasicConfigurator.configure();
        logger.info("basicLogger");
    }

    @Test
    public void addAppenderWithStream() {
        logger.addAppender(new ConsoleAppender(
                        new PatternLayout("%p %t %m%n"),
                ConsoleAppender.SYSTEM_OUT));
        logger.info("addAppenderWithStream");
    }

    @Test
    public void addAppenderWithoutStream() {
        logger.addAppender(new ConsoleAppender(
                new PatternLayout("%p %t %m%n")));
        logger.info("addAppenderWithoutStream");
    }
}