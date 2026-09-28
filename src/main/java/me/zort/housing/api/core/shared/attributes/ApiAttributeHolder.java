package me.zort.housing.api.core.shared.attributes;

public interface ApiAttributeHolder {

    void setAttribute(String key, Object value);

    <T> T getAttribute(String key, Class<T> type);
}
