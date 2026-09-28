package me.zort.housing.api.core;

import lombok.experimental.UtilityClass;
import me.zort.housing.api.core.shared.HousingApi;
import me.zort.housing.api.core.shared.lang.ApiLang;
import me.zort.housing.api.core.shared.lang.ApiLangProvider;
import me.zort.housing.api.core.shared.util.ApiThreadAssertions;
import me.zort.housing.api.core.shared.util.ApiThreadAssertionsProvider;

/**
 * HousingApiProvider is a utility class that provides access to the HousingApi instance.
 *
 * @author ZorTik
 */
@UtilityClass
public final class HousingApiProvider {

    private static HousingApi api;

    /**
     * Initializes the api.
     *
     * @param api The HousingApi instance to set.
     * @param threadAssertions The ApiThreadAssertions instance to set.
     */
    public static void init(
            HousingApi api,
            ApiThreadAssertions threadAssertions,
            ApiLang lang
    ) {
        HousingApiProvider.api = api;
        ApiThreadAssertionsProvider.setInstance(threadAssertions);
        ApiLangProvider.setLang(lang);
    }

    /**
     * Retrieves the HousingApi instance from the provider.
     *
     * @return The HousingApi instance.
     * @throws ApiNotInitializedException if the HousingApi instance has not been set.
     */
    public static HousingApi getApi() {
        if (api == null) {
            throw new ApiNotInitializedException();
        }

        return api;
    }
}
