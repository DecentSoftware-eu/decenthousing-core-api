package me.zort.housing.api.core.shared.util;

import org.bukkit.configuration.ConfigurationSection;

public interface ApiConfigItemBuilderFactory {

    ApiConfigItemBuilder fromConfig(ConfigurationSection config);
}
