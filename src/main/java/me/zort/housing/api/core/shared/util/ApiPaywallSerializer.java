package me.zort.housing.api.core.shared.util;

import me.zort.housing.api.core.ConfigurationException;
import org.bukkit.configuration.ConfigurationSection;

public interface ApiPaywallSerializer {

    /**
     * @throws ConfigurationException If anything fails when deserializing
     */
    ApiPaywall deserializePaywall(ConfigurationSection config, ApiPaywallController controller);
}
