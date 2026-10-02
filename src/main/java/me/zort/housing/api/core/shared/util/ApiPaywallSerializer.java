package me.zort.housing.api.core.shared.util;

import org.bukkit.configuration.ConfigurationSection;

public interface ApiPaywallSerializer {

    ApiPaywall deserializePaywall(ConfigurationSection config, ApiPaywallController controller);
}
