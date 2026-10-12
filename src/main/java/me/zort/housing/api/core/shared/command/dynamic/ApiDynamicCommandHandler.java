package me.zort.housing.api.core.shared.command.dynamic;

import me.zort.housing.api.core.shared.user.ApiUser;

public interface ApiDynamicCommandHandler {

    void handleCommand(ApiUser user, String cmd, String[] args);
}
