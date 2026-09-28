package me.zort.housing.api.core.plot.region;

import me.zort.housing.api.core.plot.user.ApiPlotUser;
import org.bukkit.Location;

public interface ApiRestrictionsManager {

    boolean canBuild(ApiPlotUser user, Location at);
}
