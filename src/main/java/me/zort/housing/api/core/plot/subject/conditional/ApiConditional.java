package me.zort.housing.api.core.plot.subject.conditional;

import me.zort.housing.api.core.plot.user.ApiPlotUser;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public interface ApiConditional {

    @Nullable
    String check(ApiPlotUser user);

    ItemStack getItem();
}
