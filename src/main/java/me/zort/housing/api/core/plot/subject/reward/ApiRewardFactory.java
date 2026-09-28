package me.zort.housing.api.core.plot.subject.reward;

import me.zort.housing.api.core.plot.subject.reward.types.economy.ApiEconomyReward;
import me.zort.housing.api.core.plot.subject.reward.types.item.ApiItemReward;
import me.zort.housing.api.core.plot.subject.reward.types.message.ApiMessageReward;
import me.zort.housing.api.core.plot.subject.reward.types.removeitem.ApiRemoveItemReward;
import me.zort.housing.api.core.shared.economy.offer.economy.ApiEconomyOffer;
import org.bukkit.inventory.ItemStack;

public interface ApiRewardFactory {

    ApiEconomyReward createEconomyReward(ApiEconomyOffer offer);

    ApiItemReward createItemReward(ItemStack item);

    ApiMessageReward createMessageReward(String message);

    ApiRemoveItemReward createRemoveItemReward(ItemStack item);
}
