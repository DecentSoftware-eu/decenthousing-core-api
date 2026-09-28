package me.zort.housing.api.core.shared.menu.component.gui.amountpicker;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiAmountPickerMenuArgs {
    private String title;
    private int min;
    @Builder.Default
    private int max = 999_999_999;
    @Builder.Default
    private int startingAmount = 0;
    private ApiAmountPickerMenuCallback callback;
}
