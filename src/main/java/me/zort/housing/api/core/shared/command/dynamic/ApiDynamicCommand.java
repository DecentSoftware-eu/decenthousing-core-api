package me.zort.housing.api.core.shared.command.dynamic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiDynamicCommand {
    private final String name;
    private final ApiDynamicCommandHandler handler;

    public static ApiDynamicCommand of(String name, ApiDynamicCommandHandler handler) {
        return new ApiDynamicCommand(name, handler);
    }
}
