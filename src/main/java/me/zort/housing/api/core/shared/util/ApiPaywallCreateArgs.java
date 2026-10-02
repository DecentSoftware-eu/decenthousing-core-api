package me.zort.housing.api.core.shared.util;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class ApiPaywallCreateArgs {
    @NonNull
    private ApiPaywallController controller;
}
