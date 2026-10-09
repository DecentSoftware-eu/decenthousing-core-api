package me.zort.housing.api.core.shared.user.event;

import lombok.Getter;
import me.zort.housing.api.core.shared.user.ApiUser;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;

@Getter
public abstract class ApiUserEvent extends Event {
    private final ApiUser user;

    public ApiUserEvent(@NotNull final ApiUser user) {
        this.user = user;
    }

    public ApiUserEvent(@NotNull final ApiUser user, boolean isAsync) {
        super(isAsync);
        this.user = user;
    }
}
