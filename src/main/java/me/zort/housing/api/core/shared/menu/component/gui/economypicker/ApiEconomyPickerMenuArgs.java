package me.zort.housing.api.core.shared.menu.component.gui.economypicker;

import lombok.Builder;
import lombok.Getter;
import me.zort.housing.api.core.shared.economy.ApiBalanceHolder;
import me.zort.housing.api.core.shared.menu.ApiMenu;

@Getter
@Builder
public class ApiEconomyPickerMenuArgs {
    @Builder.Default
    private ApiBalanceHolder balanceHolder = null;
    private ApiMenu parentMenu;
    private ApiEconomyPickerMenuCallback callback;
}
