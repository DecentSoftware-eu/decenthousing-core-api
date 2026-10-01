package me.zort.housing.api.core.shared.util;

import me.zort.housing.api.core.shared.economy.offer.ApiOffer;
import me.zort.housing.api.core.shared.user.ApiUser;

import java.util.concurrent.CompletableFuture;

public interface ApiPaywall {

    enum Result {
        ALLOWED,
        ABSOLUTE_LIMIT_REACHED,
        BUYABLE_LIMIT_REACHED;

        public boolean isAllowed() {
            return this == ALLOWED;
        }
    }

    CompletableFuture<Result> beginCreation(ApiUser user);

    void setPricePerAdditional(ApiOffer pricePerAdditional);

    void setAdditionalCountBuyableByEconomy(int additionalCountBuyableByEconomy);

    ApiOffer getPricePerAdditional();

    int getAdditionalCountBuyableByEconomy();

    ApiPaywallController getController();
}
