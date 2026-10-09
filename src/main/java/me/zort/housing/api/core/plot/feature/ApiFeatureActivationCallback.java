package me.zort.housing.api.core.plot.feature;

import me.zort.containr.Element;
import me.zort.housing.api.core.plot.access.ApiPermissionEntry;
import me.zort.housing.api.core.plot.item.lock.ApiLockableItem;
import me.zort.housing.api.core.plot.menu.PlotMenuType;
import me.zort.housing.api.core.plot.npc.ApiNpc;
import me.zort.housing.api.core.shared.command.dynamic.ApiDynamicCommand;
import me.zort.housing.api.core.shared.util.ApiConfigItemBuilder;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.Nullable;

public interface ApiFeatureActivationCallback {

    void registerLockableItem(ApiLockableItem item, @Nullable ApiConfigItemBuilder configItemBuilder);

    void registerItemInFeatureMenu(Element element);

    void registerItemInMenu(PlotMenuType menuType, Element element);

    void registerPermission(ApiPermissionEntry... entries);

    void registerListener(Listener listener);

    void registerDynamicCommand(ApiDynamicCommand... command);

    void spawnNpc(ApiNpc npc);

    void destroyNpc(ApiNpc npc);
}
