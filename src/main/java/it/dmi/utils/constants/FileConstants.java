package it.dmi.utils.constants;

import java.nio.file.FileSystems;

public class FileConstants {

    private static final String fileSep = FileSystems.getDefault().getSeparator();

    //Quartz
    public static final String QUARTZ_CONFIG_FILE = "quartz" + fileSep + "quartz.properties";
    public static final String QUARTZ_THREAD_COUNT = "org.quartz.threadPool.threadCount";

    //Mail
    public static final String SMTP_CONFIG_FILE = "mail" + fileSep + "smtp.yaml";
    public static final String SMTP_HOST = "mail.smtp.host";
    public static final String SMTP_PORT = "mail.smtp.port";
    public static final String SMTP_AUTH = "mail.smtp.auth";
    public static final String SMTP_STARTTLS = "mail.smtp.starttls.enable";
    public static final String SMTP_DEBUG = "mail.debug";
}