package me.zort.housing.api.core.plot.item;

import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.ApiStatus;

public interface ApiItem {

    @ApiStatus.OverrideOnly
    default void onInteractSuccess(PlayerInteractEvent event) {
    }

    ApiItemSelector getSelector();
}
