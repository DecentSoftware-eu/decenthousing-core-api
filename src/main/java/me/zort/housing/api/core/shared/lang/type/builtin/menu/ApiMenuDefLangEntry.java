package me.zort.housing.api.core.shared.lang.type.builtin.menu;

import me.zort.housing.api.core.shared.lang.ApiLangEntry;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public interface ApiMenuDefLangEntry extends ApiLangEntry {

    String getDefaultTitle();

    List<String> getDefaultPattern();

    Map<String, ItemStack> getDefaultCustomItems();
}
