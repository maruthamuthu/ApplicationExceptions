package com.pksm.exception;

import java.text.MessageFormat;

public abstract class ApplicationException extends RuntimeException
{
    private int code;

    ApplicationException(int code, String message, Object... args)
    {
        this(code, MessageFormat.format(message, args));
    }

    ApplicationException(int code, String message)
    {
        super(message);
        this.code = code;
    }

    public int getCode()
    {
        return code;
    }

    public String getResponse()
    {
        StringBuilder response = new StringBuilder();
        response.append('{');
        response.append("code:");
        response.append(this.code);
        response.append(", ");
        response.append("message:");
        response.append(this.getMessage());
        response.append('}');
        return response.toString();
    }
}
