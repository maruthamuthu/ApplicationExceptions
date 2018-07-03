package com.pksm.exception;

public class BadRequest extends ApplicationException
{
    private BadRequest(String message)
    {
        super(400, message);
    }

    private BadRequest(String message, Object... args)
    {
        super(400, message, args);
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
