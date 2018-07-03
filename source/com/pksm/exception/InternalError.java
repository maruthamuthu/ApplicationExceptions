package com.pksm.exception;

public class InternalError extends ApplicationException
{
    private InternalError(String message)
    {
        super(500, message);
    }

    private InternalError(String message, Object... args)
    {
        super(500, message, args);
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
