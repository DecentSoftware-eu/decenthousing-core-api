package me.zort.housing.api.core.shared.lang.type.builtin.item;

import me.zort.housing.api.core.shared.lang.ApiLangEntry;

import java.util.List;

public interface ApiItemLangEntry extends ApiLangEntry {

    List<String> getDefaultLore();
}
