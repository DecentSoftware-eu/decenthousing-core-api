package me.zort.housing.api.core.shared.user.event;

import lombok.Getter;
import lombok.Setter;
import me.zort.housing.api.core.shared.user.ApiUser;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ApiUserJoinEvent extends ApiUserEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Setter
    @Getter
    private boolean cancelled = false;

    public ApiUserJoinEvent(ApiUser user) {
        super(user);
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
}