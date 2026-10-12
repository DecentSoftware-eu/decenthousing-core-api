package me.zort.housing.api.core.shared.user.event;

import me.zort.housing.api.core.shared.user.ApiUser;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ApiUserPreUnloadEvent extends ApiUserEvent {
    private static final HandlerList handlers = new HandlerList();

    public ApiUserPreUnloadEvent(ApiUser user) {
        super(user, true);
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
}
