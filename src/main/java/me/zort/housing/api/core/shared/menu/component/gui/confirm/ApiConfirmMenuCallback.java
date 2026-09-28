package me.zort.housing.api.core.shared.menu.component.gui.confirm;

import me.zort.containr.GUI;
import org.bukkit.entity.Player;

public interface ApiConfirmMenuCallback {

    void onConfirm(Player player, boolean confirmed, GUI gui);
}
