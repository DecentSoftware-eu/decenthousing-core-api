package me.zort.housing.api.core.shared.util;

public interface ApiPaywallController {

    void setFreeLimit(int freeLimit);

    void setAbsoluteLimit(int absoluteLimit);

    boolean incrementLimit(int incrementBy);

    boolean canCreateMoreFree();

    int getFreeLimit();

    int getAbsoluteLimit();

    int getCurrentLimit();
}
