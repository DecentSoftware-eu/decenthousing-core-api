package me.zort.housing.api.core.shared.lang;

import lombok.Getter;
import me.zort.housing.api.core.plot.feature.ExternalFeaturePlugin;

import java.util.Objects;

/**
 * Represents a key for a language entry related to a specific {@link ExternalFeaturePlugin}.
 *
 * @author ZorTik
 */
@Getter
public class FeatureApiLangEntryKey implements ApiLangEntryKey {
    private final String featureKey;
    private final Enum<?> enumEntry;

    private String[] subsections = new String[0];

    public FeatureApiLangEntryKey(String featureKey, Enum<?> enumEntry) {
        this.featureKey = Objects.requireNonNull(featureKey);
        this.enumEntry = Objects.requireNonNull(enumEntry);
    }

    public FeatureApiLangEntryKey at(String... subsections) {
        this.subsections = Objects.requireNonNull(subsections);
        return this;
    }
}
