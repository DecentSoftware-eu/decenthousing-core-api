package me.zort.housing.api.core;

/**
 * An exception indicating that the API has not been initialized in the {@link HousingApiProvider} yet.
 *
 * @author ZorTik
 */
public class ApiNotInitializedException extends RuntimeException {

    public ApiNotInitializedException() {
        super("Housing API is not initialized.");
    }
}
