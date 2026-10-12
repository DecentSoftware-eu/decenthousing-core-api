package me.zort.housing.api.core.plot.hologram;

import me.zort.housing.api.core.shared.user.ApiUser;

import java.util.List;

public interface ApiHologram {

    String getId();

    void setText(List<Object> text);

    void show(ApiUser user);

    void hide(ApiUser user);

    void showAll();

    void hideAll();
}
