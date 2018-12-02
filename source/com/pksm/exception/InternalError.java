package com.pksm.exception;

import java.net.HttpURLConnection;

public class InternalError extends ApplicationError
{
    public InternalError(String message)
    {
        super(HttpURLConnection.HTTP_INTERNAL_ERROR, message);
    }

    public InternalError(String message, Object... args)
    {
        super(HttpURLConnection.HTTP_INTERNAL_ERROR, message, args);
    }

    public static void throwException()
    {
        throwException("Internal Error.");
    }

    public static void throwException(String message)
    {
        throw new InternalError(message);
    }

    public static void throwException(String message, Object... args)
    {
        throw new InternalError(message, args);
    }
}
