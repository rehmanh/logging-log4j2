package org.apache.logging.log4j.message;

import org.apache.logging.log4j.util.Constants;

public class TestMessage implements Message {
    private final FormattedMessageSupplier formattedMessageSupplier;
    private final String format;

    public TestMessage(final FormattedMessageSupplier formattedMessageSupplier, final String format) {
        this.formattedMessageSupplier = formattedMessageSupplier;
        this.format = format;
    }

    @Override
    public String getFormattedMessage() {
        return formattedMessageSupplier.getFormattedMessage();
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public Object[] getParameters() {
        return Constants.EMPTY_OBJECT_ARRAY;
    }

    @Override
    public Throwable getThrowable() {
        return null;
    }

    public interface FormattedMessageSupplier {
        String getFormattedMessage();
    }
}

