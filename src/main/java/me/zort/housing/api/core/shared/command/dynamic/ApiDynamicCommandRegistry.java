package me.zort.housing.api.core.shared.command.dynamic;

import org.jetbrains.annotations.Nullable;

public interface ApiDynamicCommandRegistry {

    void registerCommand(ApiDynamicCommand command);

    void unregisterCommand(ApiDynamicCommand command);

    void unregisterCommand(String name);

    @Nullable
    ApiDynamicCommand getCommand(String name);
}
