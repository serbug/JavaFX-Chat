package com.exception;

/**
 * @author Sergiu
 */
public class DuplicateUsernameException extends Exception {
    public DuplicateUsernameException(String message){
        super(message);
    }
}
