package me.zort.housing.api.core.shared.user;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public interface ApiUserManager {

    @Nullable
    ApiUser getUser(Player player);

    void ifUserLoaded(Player player, Consumer<ApiUser> actionIfLoaded);
}
