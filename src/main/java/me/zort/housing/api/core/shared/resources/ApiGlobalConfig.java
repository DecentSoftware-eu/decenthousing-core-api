package me.zort.housing.api.core.shared.resources;

import org.bukkit.configuration.file.YamlConfiguration;

public interface ApiGlobalConfig {

    String getName();

    YamlConfiguration getData();
}
