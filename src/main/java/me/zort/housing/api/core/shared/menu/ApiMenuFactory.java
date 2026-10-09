package me.zort.housing.api.core.shared.menu;

import me.zort.housing.api.core.shared.menu.component.gui.amountpicker.ApiAmountPickerMenuArgs;
import me.zort.housing.api.core.shared.menu.component.gui.confirm.ApiConfirmMenuArgs;
import me.zort.housing.api.core.shared.menu.component.gui.economypicker.ApiEconomyPickerMenuArgs;
import me.zort.housing.api.core.shared.menu.component.gui.input.ApiInputMenuArgs;
import me.zort.housing.api.core.shared.menu.component.gui.iteminput.ApiItemInputMenuArgs;
import me.zort.housing.api.core.shared.menu.component.gui.optionselector.ApiOptionSelectorMenuArgs;

public interface ApiMenuFactory {

    ApiMenu createLocalizedMenu(ApiLocalizedMenu menu);

    ApiMenu createConfirmMenu(ApiConfirmMenuArgs args);

    ApiMenu createInputMenu(ApiInputMenuArgs args);

    ApiMenu createItemInputMenu(ApiItemInputMenuArgs args);

    ApiMenu createEconomyPickerMenu(ApiEconomyPickerMenuArgs args);

    ApiMenu createAmountPickerMenu(ApiAmountPickerMenuArgs args);

    <T> ApiMenu createOptionSelector(ApiOptionSelectorMenuArgs<T> args);
}
