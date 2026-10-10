package me.zort.housing.api.core.plot.feature;

import lombok.experimental.UtilityClass;
import me.zort.containr.ContextClickInfo;
import me.zort.housing.api.core.plot.HousingApiPlot;
import me.zort.housing.api.core.plot.item.lock.ApiLockableItem;
import me.zort.housing.api.core.shared.HousingApi;
import me.zort.housing.api.core.shared.util.ApiConfigItemBuilder;
import org.bukkit.configuration.ConfigurationSection;

import java.util.function.Consumer;

@UtilityClass
public final class FeatureFacade {

    /**
     * Registers a lockable item and its corresponding menu element in the feature menu.
     *
     * @param callback The callback to register the item and menu element.
     * @param itemConfig The configuration section for the item.
     * @param item The lockable item to be registered.
     * @param giveItemFunction A function to handle giving the item to a player when clicked in the menu.
     */
    public static void registerFeatureItem(
            ApiFeatureActivationCallback callback,
            ConfigurationSection itemConfig,
            ApiLockableItem item,
            Consumer<ContextClickInfo> giveItemFunction
    ) {
        HousingApiPlot api = HousingApi.getPlotApi();

        ApiConfigItemBuilder itemConfigBuilder = api.getConfigItemBuilderFactory().fromConfig(itemConfig);
        itemConfigBuilder.lockStateSupplier(() -> !api.getItemLockService().isUnlocked(item));

        callback.registerLockableItem(item, itemConfigBuilder);
        callback.registerItemInFeatureMenu(
                api.getPlotMenuElementFactory().createConfiguredElement(
                        item,
                        itemConfigBuilder,
                        giveItemFunction
                )
        );
    }
}
