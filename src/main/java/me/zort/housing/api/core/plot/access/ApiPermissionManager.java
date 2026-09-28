package me.zort.housing.api.core.plot.access;

import me.zort.housing.api.core.shared.user.ApiUser;

public interface ApiPermissionManager {

    boolean has(ApiUser user, ApiPermissionEntry entry);
}
