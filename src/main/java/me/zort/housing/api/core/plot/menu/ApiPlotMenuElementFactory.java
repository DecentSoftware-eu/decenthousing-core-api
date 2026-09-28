package me.zort.housing.api.core.plot.menu;

import me.zort.containr.ContextClickInfo;
import me.zort.containr.Element;
import me.zort.housing.api.core.plot.item.ApiItem;
import me.zort.housing.api.core.shared.util.ApiConfigItemBuilder;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public interface ApiPlotMenuElementFactory {

    Element createConfiguredElement(
            ApiItem item,
            ApiConfigItemBuilder itemConfig,
            @Nullable Consumer<ContextClickInfo> finalClickConsumer
    );
}
