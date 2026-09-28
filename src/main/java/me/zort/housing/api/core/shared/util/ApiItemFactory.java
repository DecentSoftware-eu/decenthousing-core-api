package me.zort.housing.api.core.shared.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public interface ApiItemFactory {

    ItemStack blank(Material material);

    ItemStack skullFromBase64(String base64);
}
