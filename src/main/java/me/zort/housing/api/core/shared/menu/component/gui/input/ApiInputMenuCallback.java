package me.zort.housing.api.core.shared.menu.component.gui.input;

import org.bukkit.entity.Player;

public interface ApiInputMenuCallback {

    void onInput(String input, Player player);

    default void onException(Throwable exception, Player player) {
        exception.printStackTrace();
    }
}
