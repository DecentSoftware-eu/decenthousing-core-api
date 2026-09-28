package me.zort.housing.api.core.plot.subject.conditional.types.item;

import me.zort.housing.api.core.plot.subject.conditional.ApiConditional;
import org.bukkit.inventory.ItemStack;

public interface ApiHasItemConditional extends ApiConditional {

    ItemStack getRequiredItem();
}
