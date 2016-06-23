package com.comcast.csv.meme;

/**
 * Exception thrown for all failures related to {@link Meme} loading.
 */
@SuppressWarnings("serial")
public class YoureDoingItWrongException extends Exception {

    public YoureDoingItWrongException(String message) {
        super(message);
    }

    public YoureDoingItWrongException(String message, Throwable cause) {
        super(message, cause);
    }
}
