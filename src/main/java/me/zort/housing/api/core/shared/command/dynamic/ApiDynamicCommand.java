package me.zort.housing.api.core.shared.command.dynamic;

public interface ApiDynamicCommand {

    String getName();

    ApiDynamicCommandHandler getHandler();
}
