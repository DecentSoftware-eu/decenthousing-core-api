package me.zort.housing.api.core.shared.lang;

import me.zort.housing.api.core.shared.user.ApiUser;

public interface ApiCoreMessage {

    void send(ApiUser user);
}
