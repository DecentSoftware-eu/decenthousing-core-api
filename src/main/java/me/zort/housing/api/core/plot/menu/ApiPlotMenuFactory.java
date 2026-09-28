package me.zort.housing.api.core.plot.menu;

import me.zort.housing.api.core.shared.menu.ApiMenu;
import me.zort.housing.api.core.shared.user.ApiUser;

public interface ApiPlotMenuFactory {

    ApiMenu createFeatureItemsMenu(String featureId, ApiUser user);

    ApiMenu createOtherMenu(ApiUser user);
}
