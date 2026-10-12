package me.zort.housing.api.core.plot.hologram;

import org.bukkit.Location;

import java.util.List;

public interface ApiHologramService {

    ApiHologram createHologram(Location location);

    boolean deleteHologram(ApiHologram hologram);

    List<ApiHologram> getHolograms();
}
