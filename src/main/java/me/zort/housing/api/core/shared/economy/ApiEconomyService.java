package me.zort.housing.api.core.shared.economy;

import me.zort.housing.api.core.shared.economy.offer.ApiOffer;
import me.zort.housing.api.core.shared.economy.sack.ApiSack;
import org.jetbrains.annotations.Nullable;

public interface ApiEconomyService {

    ApiOffer createOffer(ApiEconomy economy, int amount, @Nullable ApiSack receiverOfMoney);
}
