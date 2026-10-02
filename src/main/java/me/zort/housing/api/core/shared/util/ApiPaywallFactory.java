package me.zort.housing.api.core.shared.util;

public interface ApiPaywallFactory {

    ApiPaywall createPaywall(ApiPaywallCreateArgs args);

    ApiPaywallController createController(ApiPaywallControllerCreateArgs args);
}
