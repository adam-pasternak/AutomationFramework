package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private static final Logger log = LogManager.getLogger();

    public static void logInfo(String message) {
        log.info(message);
    }

    public static void logDebug(String message) {
        log.debug(message);
    }

    public static void logWarn(String message) {
        log.warn(message);
    }

    public static void logError(String message) {
        log.error(message);
    }
}
