package org.apache.log4j.helpers;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.AbstractConfiguration;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.LoggerConfig;

public class BasicConfiguration extends AbstractConfiguration {
    private static final long serialVersionUID = -2716784321395089563L;

    private static final String DEFAULT_LEVEL = "org.apache.logging.log4j.level";

    public BasicConfiguration(final LoggerContext loggerContext) {
        super(loggerContext, ConfigurationSource.NULL_SOURCE);

        final LoggerConfig root = getRootLogger();
        setName("BasicConfiguration");
        final String levelName = System.getProperty(DEFAULT_LEVEL);
        final Level level = (levelName != null && Level.getLevel(levelName) != null) ? Level.getLevel(levelName)
                : Level.DEBUG;
        root.setLevel(level);
    }

    @Override
    protected void doConfigure() {
    }
}
