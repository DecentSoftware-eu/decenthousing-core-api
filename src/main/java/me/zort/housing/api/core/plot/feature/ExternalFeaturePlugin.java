package me.zort.housing.api.core.plot.feature;

import me.zort.housing.api.core.shared.lang.ApiLangEntry;
import org.bukkit.configuration.ConfigurationSection;
import org.jetbrains.annotations.ApiStatus;

import java.util.List;

public abstract class ExternalFeaturePlugin {

    @ApiStatus.OverrideOnly
    public void load() {
        // To be implemented by subclasses
    }

    @ApiStatus.OverrideOnly
    public void preEnable(ApiFeatureActivationCallback callback, ConfigurationSection settings) {
        // To be implemented by subclasses
    }

    @ApiStatus.OverrideOnly
    public void enable(ApiFeatureActivationCallback callback, ConfigurationSection settings) {
        // To be implemented by subclasses
    }

    @ApiStatus.OverrideOnly
    public void disable() {
        // To be implemented by subclasses
    }

    public Iterable<ApiLangEntry[]> getLangEntries() {
        return List.of();
    }
}
