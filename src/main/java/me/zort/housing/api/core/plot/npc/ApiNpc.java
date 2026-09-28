package me.zort.housing.api.core.plot.npc;

import me.zort.housing.api.core.shared.util.ApiCoords;

import java.util.List;

public interface ApiNpc {

    void onClick(ApiNpcInteraction interaction);

    ApiNpcSkin getSkin();

    List<String> getHologramLines();

    ApiCoords getCoords();
}
