package org.apache.logging.log4j.core.config;

import org.apache.logging.log4j.Level;

public class BasicConfiguration extends AbstractConfiguration {
    private static final String DEFAULT_LEVEL = "org.apache.logging.log4j.level";

    public BasicConfiguration() {
        super(null, ConfigurationSource.NULL_SOURCE);

        final LoggerConfig root = getRootLogger();
        final String name = System.getProperty(DEFAULT_LEVEL);
        final Level level = (name != null && Level.getLevel(name) != null) ? Level.getLevel(name) : Level.ERROR;
        root.setLevel(level);
    }
}
