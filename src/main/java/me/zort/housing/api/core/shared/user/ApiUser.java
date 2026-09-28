package me.zort.housing.api.core.shared.user;

import me.zort.housing.api.core.shared.lang.ApiCoreMessage;
import me.zort.housing.api.core.shared.lang.type.builtin.message.ApiMessageLangEntry;
import org.bukkit.entity.Player;

public interface ApiUser {

    int getId();

    String getName();

    Player getPlayer();

    void sendMessage(ApiMessageLangEntry message, Object... replacements);

    default void sendMessage(ApiCoreMessage message) {
        message.send(this);
    }
}
