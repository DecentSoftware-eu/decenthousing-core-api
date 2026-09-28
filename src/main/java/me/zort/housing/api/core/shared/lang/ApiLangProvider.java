package me.zort.housing.api.core.shared.lang;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class ApiLangProvider {

    private static ApiLang lang;

    public static void setLang(ApiLang lang) {
        ApiLangProvider.lang = lang;
    }

    public static ApiLang getLang() {
        if (lang == null) {
            throw new IllegalStateException("ApiLang is not set.");
        }

        return lang;
    }
}
