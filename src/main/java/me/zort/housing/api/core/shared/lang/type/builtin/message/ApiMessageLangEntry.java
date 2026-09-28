package me.zort.housing.api.core.shared.lang.type.builtin.message;

import me.zort.housing.api.core.shared.lang.ApiLangEntry;

import java.util.List;

public interface ApiMessageLangEntry extends ApiLangEntry {

    List<String> getDefaultValue();
}
