package me.zort.housing.api.core.shared.lang.type.builtin.item;

import org.bukkit.inventory.ItemStack;

public interface ApiLangItem {

    ItemStack apply(ItemStack item, Object... placeholders);

    ItemStack build(Object... placeholders);
}
