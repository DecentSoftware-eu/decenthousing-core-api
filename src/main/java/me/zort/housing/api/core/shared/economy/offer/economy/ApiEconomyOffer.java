package me.zort.housing.api.core.shared.economy.offer.economy;

import me.zort.housing.api.core.shared.economy.ApiEconomy;
import me.zort.housing.api.core.shared.economy.offer.ApiOffer;

public interface ApiEconomyOffer extends ApiOffer {

    ApiEconomy getEconomy();

    double getAmount();
}
