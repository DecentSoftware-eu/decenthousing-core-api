package me.zort.housing.api.core.shared.menu.component.gui.optionselector;

import me.zort.containr.GUI;
import org.bukkit.entity.Player;

public interface ApiOptionSelectorMenuDecider<T> {

    default boolean onPreSelect(T option, boolean newState, Player player, GUI gui) {
        return true;
    }
}
