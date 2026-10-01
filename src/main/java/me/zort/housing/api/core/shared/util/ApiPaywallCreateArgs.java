package me.zort.housing.api.core.shared.util;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import org.bukkit.inventory.ItemStack;

@Getter
@Builder
public class ApiPaywallCreateArgs {
    @NonNull
    private ApiPaywallController controller;
    @NonNull
    private String titleOnBuyMenu;
    private ItemStack itemOnBuyMenu;
}
