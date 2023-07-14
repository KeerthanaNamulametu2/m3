package com.company;

/**
 * Common exception methods
 *
 */
public class Clip06
{
    public static void main( String[] args ) throws Throwable {
        try {
            throw new Exception("Sample exception");
        } catch(Exception e) {
            System.err.println("getMessage(): " + e.getMessage());
            System.err.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.err.println("getCause(): " + e.getCause());
            System.err.println("printStackTrace(): ");
            e.printStackTrace();
            System.err.println("fillInStackTrace(): ");
             throw e.fillInStackTrace();

        }
    }
}
