package me.zort.housing.api.core.shared;

import org.bukkit.Location;
import org.bukkit.World;

public interface ApiPlotHolderServer extends ApiPlotHolder, ApiWorldHolder {

    boolean isPlotWorld(Location location);

    boolean isPlotWorld(World world);
}
