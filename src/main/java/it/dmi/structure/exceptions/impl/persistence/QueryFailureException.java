package it.dmi.structure.exceptions.impl.persistence;

import it.dmi.structure.exceptions.MSDException;

public class QueryFailureException extends MSDException {

    public QueryFailureException(String message) {
        super(message);
    }

    public QueryFailureException(String message, String faultyQuery) {
        super("Faulty query: " + faultyQuery + ". " + message);
    }

    public QueryFailureException(String message, Throwable cause) {
        super(message, cause);
    }
}