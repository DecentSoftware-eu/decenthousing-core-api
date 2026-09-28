package me.zort.housing.api.core.plot.subject.reward.types.economy;

import me.zort.housing.api.core.plot.subject.reward.ApiReward;
import me.zort.housing.api.core.shared.economy.offer.economy.ApiEconomyOffer;

public interface ApiEconomyReward extends ApiReward {

    ApiEconomyOffer getOffer();
}
