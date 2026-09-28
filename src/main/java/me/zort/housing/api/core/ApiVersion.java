package me.zort.housing.api.core;

import java.util.Objects;

/**
 * Represents an API version for the Housing API.
 *
 * @author ZorTik
 */
public final class ApiVersion {
    private final int apiVersionNumber;

    public ApiVersion(int apiVersionNumber) {
        this.apiVersionNumber = apiVersionNumber;
    }

    /**
     * Checks if this API version is compatible (can be applied to) with another API version.
     *
     * @param other The other API version to compare with.
     * @return true if this version is compatible with the other version, false otherwise.
     */
    public boolean isInCompatibilityRangeOf(ApiVersion other) {
        // we maintain backwards compatibility, so lower should be compatible with higher
        return this.apiVersionNumber <= other.apiVersionNumber;
    }

    public int getNumber() {
        return apiVersionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ApiVersion that = (ApiVersion) o;
        return apiVersionNumber == that.apiVersionNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(apiVersionNumber);
    }

    @Override
    public String toString() {
        return String.valueOf(apiVersionNumber);
    }
}
