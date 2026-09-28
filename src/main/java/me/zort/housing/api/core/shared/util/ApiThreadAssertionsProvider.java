package me.zort.housing.api.core.shared.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class ApiThreadAssertionsProvider {

    private static ApiThreadAssertions instance;

    public static void setInstance(ApiThreadAssertions instance) {
        ApiThreadAssertionsProvider.instance = instance;
    }

    public static ApiThreadAssertions getInstance() {
        if (instance == null) {
            throw new IllegalStateException("ApiThreadAssertions instance has not been set.");
        }

        return instance;
    }
}
