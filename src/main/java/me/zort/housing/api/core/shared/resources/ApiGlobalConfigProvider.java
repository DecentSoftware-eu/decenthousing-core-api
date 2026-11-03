package me.zort.housing.api.core.shared.resources;

import me.zort.housing.api.core.ConfigurationException;

import java.io.InputStream;
import java.util.function.Supplier;

public interface ApiGlobalConfigProvider {

    /**
     * @throws ConfigurationException
     * @throws NullPointerException if name is null
     */
    ApiGlobalConfig loadFromStorage(String name);

    /**
     * @throws ConfigurationException
     * @throws NullPointerException if name or defaultYamlFileDataSupplier is null
     */
    ApiGlobalConfig loadFromStorage(String name, Supplier<InputStream> defaultYamlFileDataSupplier);
}
