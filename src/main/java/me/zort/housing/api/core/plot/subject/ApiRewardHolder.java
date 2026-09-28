package me.zort.housing.api.core.plot.subject;

import me.zort.housing.api.core.plot.subject.conditional.ApiConditional;
import me.zort.housing.api.core.plot.subject.reward.ApiReward;
import me.zort.housing.api.core.plot.user.ApiPlotUser;
import me.zort.housing.api.core.shared.economy.offer.ApiOffer;
import me.zort.housing.api.core.shared.menu.ApiMenu;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

public interface ApiRewardHolder {

    void addReward(ApiReward reward);

    void addConditional(ApiConditional conditional);

    void removeReward(ApiReward reward);

    void removeConditional(ApiConditional conditional);

    void giveRewards(ApiPlotUser user, boolean force, @Nullable Runnable callback);

    void editConditionals(ApiPlotUser editor, @Nullable ApiMenu parent);

    void setOffer(@Nullable ApiOffer offer);

    @Nullable
    ApiOffer getOffer();

    @Unmodifiable
    List<ApiReward> getRewards();

    @Unmodifiable
    List<ApiConditional> getConditionals();

    ApiRewardHolder copy();
}
