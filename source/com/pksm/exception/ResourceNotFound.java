package com.pksm.exception;

import java.net.HttpURLConnection;

public class ResourceNotFound extends ApplicationError
{
    public ResourceNotFound(String message)
    {
        super(HttpURLConnection.HTTP_NOT_FOUND, message);
    }

    public ResourceNotFound(String message, Object... args)
    {
        super(HttpURLConnection.HTTP_NOT_FOUND, message, args);
    }

    public static void throwException() throws RuntimeException
    {
        throwException("Resource not found.");
    }

    public static void throwException(String message)
    {
        throw new ResourceNotFound(message);
    }

    public static void throwException(String message, Object... args)
    {
        throw new ResourceNotFound(message, args);
    }
}
