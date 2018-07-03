package com.pksm.exception;

public class ResourceNotFound extends ApplicationException
{
    private ResourceNotFound(String message)
    {
        super(404, message);
    }

    private ResourceNotFound(String message, Object... args)
    {
        super(404, message, args);
    }

    public static void throwException()
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
