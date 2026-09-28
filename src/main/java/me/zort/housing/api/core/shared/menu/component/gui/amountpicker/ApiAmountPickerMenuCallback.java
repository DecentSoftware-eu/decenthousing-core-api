package me.zort.housing.api.core.shared.menu.component.gui.amountpicker;

import org.bukkit.entity.Player;

public interface ApiAmountPickerMenuCallback {

    void onConfirm(int amount, Player player);
}
