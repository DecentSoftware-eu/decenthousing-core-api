package me.zort.housing.api.core.shared.lang.type.builtin.text;

import me.zort.housing.api.core.shared.lang.ApiLangEntry;

import java.util.List;

public interface ApiTextLangEntry extends ApiLangEntry {

    List<String> getDefaultText();
}
