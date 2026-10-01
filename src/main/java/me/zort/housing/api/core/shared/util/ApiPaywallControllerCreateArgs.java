package me.zort.housing.api.core.shared.util;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Getter
@Builder
public class ApiPaywallControllerCreateArgs {
    @NonNull
    private Supplier<Integer> currentAmountSupplier;
    @NonNull
    private Consumer<Integer> storeBoughtCountSetter;
    @NonNull
    private Supplier<Integer> storeBoughtCountGetter;
}
