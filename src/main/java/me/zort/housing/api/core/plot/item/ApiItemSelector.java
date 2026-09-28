package me.zort.housing.api.core.plot.item;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public interface ApiItemSelector {

    boolean matches(ItemStack itemStack, Plugin plugin);
}
