package com.pksm.exception;

import java.net.HttpURLConnection;

public class BadRequest extends ApplicationError
{
    public BadRequest(String message)
    {
        super(HttpURLConnection.HTTP_BAD_REQUEST, message);
    }

    public BadRequest(String message, Object... args)
    {
        super(HttpURLConnection.HTTP_BAD_REQUEST, message, args);
    }

    public static void throwException()
    {
        throwException("Bad request.");
    }

    public static void throwException(String message)
    {
        throw new BadRequest(message);
    }

    public static void throwException(String message, Object... args)
    {
        throw new BadRequest(message, args);
    }
}
