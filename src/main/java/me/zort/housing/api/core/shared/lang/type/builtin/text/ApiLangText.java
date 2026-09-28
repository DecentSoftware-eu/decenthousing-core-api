package me.zort.housing.api.core.shared.lang.type.builtin.text;

import net.kyori.adventure.text.Component;

import java.util.List;

public interface ApiLangText {

    String firstOrEmpty();

    List<String> getText();

    List<Component> getTextAsComponents(Object... placeholders);
}
