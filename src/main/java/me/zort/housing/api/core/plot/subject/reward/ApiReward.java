package me.zort.housing.api.core.plot.subject.reward;

import me.zort.housing.api.core.plot.user.ApiPlotUser;
import org.bukkit.inventory.ItemStack;

public interface ApiReward {

    void give(ApiPlotUser user);

    ItemStack getItem();
}
