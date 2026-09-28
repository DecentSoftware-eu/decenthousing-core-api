package me.zort.housing.api.core.shared.lang.type.builtin.message;

import net.kyori.adventure.text.Component;

public interface ApiLangMessage {

    Component asComponent(Object... placeholders);
}
