package me.zort.housing.api.core.plot.world.event;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ApiPlotPreResetEvent extends Event implements Cancellable {
    @Getter
    private static final HandlerList handlerList = new HandlerList();

    @Setter
    @Getter
    private boolean cancelled;
    @Setter
    @Getter
    private String cancelReason;

    public ApiPlotPreResetEvent() {
        super(true);
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }
}
