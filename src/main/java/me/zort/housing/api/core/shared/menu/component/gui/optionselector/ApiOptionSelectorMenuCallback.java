package me.zort.housing.api.core.shared.menu.component.gui.optionselector;

import me.zort.containr.GUI;
import org.bukkit.entity.Player;

import java.util.List;

public interface ApiOptionSelectorMenuCallback<T> {

    void onOptionsSelected(List<T> options, Player player);

    default void onOptionsSelected(List<T> options, Player player, GUI gui) {
        onOptionsSelected(options, player);
    }
}
