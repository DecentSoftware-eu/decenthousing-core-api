package me.zort.housing.api.core.shared.util;

import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public interface ApiConfigItemBuilder {

    ApiConfigItemBuilder lockStateSupplier(@Nullable Supplier<Boolean> lockStateSupplier);
}
