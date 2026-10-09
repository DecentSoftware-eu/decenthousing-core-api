package me.zort.housing.api.core.plot.subject;

import me.zort.housing.api.core.plot.subject.conditional.ApiConditional;
import me.zort.housing.api.core.plot.subject.exception.ApiGiveCheckException;
import me.zort.housing.api.core.plot.subject.reward.ApiReward;
import me.zort.housing.api.core.plot.user.ApiPlotUser;
import me.zort.housing.api.core.shared.economy.offer.ApiOffer;
import me.zort.housing.api.core.shared.menu.ApiMenu;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ApiRewardHolder {

    void addReward(ApiReward reward);

    void addConditional(ApiConditional conditional);

    void removeReward(ApiReward reward);

    void removeConditional(ApiConditional conditional);

    void giveRewards(ApiPlotUser user, boolean force, @Nullable Runnable callback);

    /**
     * @throws ApiGiveCheckException if the user cannot receive rewards from this holder
     */
    void checkCanGiveRewards(ApiPlotUser user);

    CompletableFuture<Void> buyWithOffer(ApiPlotUser user);

    void edit(ApiPlotUser editor, @Nullable ApiMenu parent);

    void view(ApiPlotUser viewer, @Nullable ApiMenu parent);

    void editRewards(ApiPlotUser editor, @Nullable ApiMenu parent);

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
