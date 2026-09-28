package me.zort.housing.api.core.plot.bank;

import me.zort.housing.api.core.shared.economy.ApiBalanceHolder;
import me.zort.housing.api.core.shared.economy.ApiEconomy;
import me.zort.housing.api.core.shared.economy.sack.ApiSack;

public interface ApiBank extends ApiBalanceHolder {

    ApiSack getBalance(ApiEconomy economy);
}
