package me.zort.housing.api.core.shared.menu.component.gui.iteminput;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ApiItemInputMenuCallback {

    void onInput(ItemStack item, Player player);
}
