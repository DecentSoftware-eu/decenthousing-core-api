package me.zort.housing.api.core.shared.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.Location;

@Data
@AllArgsConstructor
public class ApiCoords {
    private double x;
    private double y;
    private double z;

    private float yaw;
    private float pitch;

    public static ApiCoords from(Location location) {
        return new ApiCoords(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
    }

    public ApiCoords copy() {
        return new ApiCoords(x, y, z, yaw, pitch);
    }
}
