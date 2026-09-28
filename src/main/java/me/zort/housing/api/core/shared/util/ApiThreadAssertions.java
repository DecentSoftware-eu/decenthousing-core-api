package me.zort.housing.api.core.shared.util;

public interface ApiThreadAssertions {

    void doRequirePrimaryThread();

    static void requirePrimaryThread() {
        ApiThreadAssertionsProvider.getInstance().doRequirePrimaryThread();
    }
}
