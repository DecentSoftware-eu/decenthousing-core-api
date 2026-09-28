package me.zort.housing.api.core.plot.subject.conditional;

import me.zort.housing.api.core.plot.subject.conditional.types.bankhasamount.ApiBankHasAmountConditional;
import me.zort.housing.api.core.plot.subject.conditional.types.item.ApiHasItemConditional;
import me.zort.housing.api.core.shared.economy.ApiEconomy;
import org.bukkit.inventory.ItemStack;

public interface ApiConditionalFactory {

    ApiBankHasAmountConditional createBankHasAmountConditional(ApiEconomy economy, double amount);

    ApiHasItemConditional createHasItemConditional(ItemStack item);
}
