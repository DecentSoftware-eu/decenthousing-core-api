package me.zort.housing.api.core.shared.menu.component.gui.optionselector;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import me.zort.housing.api.core.shared.menu.ApiMenu;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

@Getter
@Builder
public class ApiOptionSelectorMenuArgs<T> {
    @NonNull
    private String title;
    @NonNull
    private Map<T, ItemStack> options;
    @Builder.Default
    private List<T> selected = List.of();
    @Builder.Default
    private int limit = 1;
    @Builder.Default
    private int min = 0;
    @Builder.Default
    private boolean allowSelectedNotMatch = false;
    @Builder.Default
    private boolean requiresAccept = true;
    @Builder.Default
    private ApiOptionSelectorMenuDecider<T> decider = null;
    @Builder.Default
    private ApiMenu parentMenu = null;
    @NonNull
    private ApiOptionSelectorMenuCallback<T> callback;
}
