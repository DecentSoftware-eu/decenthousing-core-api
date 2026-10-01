package me.zort.housing.api.core.shared;

import me.zort.housing.api.core.ApiVersion;
import me.zort.housing.api.core.HousingApiProvider;
import me.zort.housing.api.core.plot.HousingApiPlot;
import me.zort.housing.api.core.shared.economy.ApiEconomyService;
import me.zort.housing.api.core.shared.economy.offer.ApiOfferSerializationService;
import me.zort.housing.api.core.shared.lang.ApiCoreMessageFactory;
import me.zort.housing.api.core.shared.menu.ApiMenuElementFactory;
import me.zort.housing.api.core.shared.menu.ApiMenuFactory;
import me.zort.housing.api.core.shared.user.ApiUserManager;
import me.zort.housing.api.core.shared.util.*;

public interface HousingApi {

    ApiUserManager getUserManager();

    ApiConfigItemBuilderFactory getConfigItemBuilderFactory();

    ApiCoreMessageFactory getCoreMessageFactory();

    ApiItemFactory getItemFactory();

    ApiConstantsProvider getConstantsProvider();

    ApiMenuFactory getMenuFactory();

    ApiMenuElementFactory getMenuElementFactory();

    ApiEconomyService getEconomyService();

    ApiMenuUtil getMenuUtil();

    ApiColorsUtil getColorsUtil();

    ApiOfferSerializationService getOfferSerializationService();

    /**
     * Retrieves the HousingApi instance from the HousingApiProvider.
     *
     * @return The HousingApi instance.
     */
    static HousingApi getApi() {
        return HousingApiProvider.getApi();
    }

    /**
     * Retrieves the HousingApiPlot instance from the HousingApiProvider.
     *
     * @return The HousingApiPlot instance.
     * @throws IllegalStateException if the HousingApi instance does not implement HousingApiPlot.
     */
    static HousingApiPlot getPlotApi() {
        HousingApi api = getApi();
        if (api instanceof HousingApiPlot) {
            return (HousingApiPlot) api;
        }

        throw new IllegalStateException("HousingApi does not implement HousingApiPlot");
    }

    /**
     * Returns the current version of the Housing Core API.
     *
     * @return The current version of the Housing Core API.
     */
    static ApiVersion getApiVersion() {
        return new ApiVersion(2);
    }
}
