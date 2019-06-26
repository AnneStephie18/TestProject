package com.atmecs.LogManager;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogFactory {
	private final static ThreadLocal<Logger> logFactory = new ThreadLocal<>();
	Logger log;
    public static void createNewLogger(String className) {

        Logger log = Logger.getLogger("Thread" + className);

        Properties props = new Properties();
        props.setProperty("log4j.appender.file", "org.apache.log4j.RollingFileAppender");

        props.setProperty("log4j.appender.file.maxFileSize", "100MB");
        props.setProperty("log4j.appender.file.Append", "false");
        props.setProperty("log4j.", "100MB");
        props.setProperty("log4j.appender.file.maxBackupIndex", "100");
        props.setProperty("log4j.appender.file.File", "logs/" + className + ".log");
        props.setProperty("log4j.appender.file.threshold", "info");
        props.setProperty("log4j.appender.file.layout", "org.apache.log4j.PatternLayout");
        props.setProperty("log4j.appender.file.layout.ConversionPattern", "%d{yyyy-MM-dd HH-mm-ss} | %-5p | %C{1}:%L | %m%n");
        props.setProperty("log4j.appender.stdout", "org.apache.log4j.ConsoleAppender");
        props.setProperty("log4j.appender.stdout.Target", "System.out");
        props.setProperty("log4j.logger." + "Thread" + className, "INFO, file");
        PropertyConfigurator.configure(props);
        logFactory.set(log);
    }

    public static Logger getLogger() {
        return logFactory.get();
    }
    public static void main(String[] args) {
	}

}
