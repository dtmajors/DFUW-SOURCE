/*
 * Decompiled with CFR.
 */
package com.thoughtworks.xstream.core;

public abstract class BaseException
extends RuntimeException {
    private Throwable cause;

    protected BaseException(String message, Throwable cause) {
        super(message + (cause == null ? "" : " : " + cause.getMessage()));
        this.cause = cause;
    }

    protected BaseException(Throwable cause) {
        this("", cause);
    }

    protected BaseException(String message) {
        this(message, null);
    }

    protected BaseException() {
        this("", null);
    }

    public Throwable getCause() {
        return this.cause;
    }
}

