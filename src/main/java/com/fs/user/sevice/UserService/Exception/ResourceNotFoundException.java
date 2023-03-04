package com.fs.user.sevice.UserService.Exception;

public class ResourceNotFoundException extends RuntimeException
{
    public ResourceNotFoundException()
    {
        super("Resource not found by giver ID");
    }

    public ResourceNotFoundException(String message)
    {
        super(message);
    }
}
