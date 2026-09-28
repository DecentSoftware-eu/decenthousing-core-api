package me.zort.housing.api.core.plot.subject.conditional.types.bankhasamount;

import me.zort.housing.api.core.plot.subject.conditional.ApiConditional;
import me.zort.housing.api.core.shared.economy.ApiEconomy;

public interface ApiBankHasAmountConditional extends ApiConditional {

    ApiEconomy getEconomy();

    double getAmount();
}
