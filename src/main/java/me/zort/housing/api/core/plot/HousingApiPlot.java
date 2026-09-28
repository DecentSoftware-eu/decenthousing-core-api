package me.zort.housing.api.core.plot;

import me.zort.housing.api.core.plot.access.ApiPermissionManager;
import me.zort.housing.api.core.plot.bank.ApiBank;
import me.zort.housing.api.core.plot.item.lock.ApiItemLockService;
import me.zort.housing.api.core.plot.menu.ApiPlotMenuElementFactory;
import me.zort.housing.api.core.plot.menu.ApiPlotMenuFactory;
import me.zort.housing.api.core.plot.region.ApiRestrictionsManager;
import me.zort.housing.api.core.plot.subject.ApiRewardHolderFactory;
import me.zort.housing.api.core.plot.subject.ApiRewardSerializerService;
import me.zort.housing.api.core.plot.subject.conditional.ApiConditionalFactory;
import me.zort.housing.api.core.plot.subject.reward.ApiRewardFactory;
import me.zort.housing.api.core.shared.ApiPlotHolderServer;
import me.zort.housing.api.core.shared.HousingApi;
import me.zort.housing.api.core.shared.attributes.ApiAttributeHolder;

public interface HousingApiPlot extends HousingApi {

    ApiAttributeHolder getPlotAttributeHolder();

    ApiPlotHolderServer getPlotHolderServer();

    ApiRestrictionsManager getRestrictionsManager();

    ApiItemLockService getItemLockService();

    ApiPlotMenuElementFactory getPlotMenuElementFactory();

    ApiPermissionManager getPermissionManager();

    ApiPlotMenuFactory getPlotMenuFactory();

    ApiBank getBank();

    ApiRewardSerializerService getRewardSerializerService();

    ApiRewardHolderFactory getRewardHolderFactory();

    ApiRewardFactory getRewardFactory();

    ApiConditionalFactory getConditionalFactory();
}
