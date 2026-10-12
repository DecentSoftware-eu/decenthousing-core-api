package me.zort.housing.api.core.plot.subject;

import com.google.gson.JsonObject;
import me.zort.housing.api.core.plot.subject.conditional.ApiConditional;
import me.zort.housing.api.core.plot.subject.reward.ApiReward;

public interface ApiRewardSerializerService {

    JsonObject serialize(ApiRewardHolder rewardHolder);

    ApiRewardHolder deserialize(JsonObject data);

    void deserializeAndApply(JsonObject data, ApiRewardHolder rewardHolder);

    ApiReward deserializeReward(JsonObject json);

    JsonObject serializeReward(ApiReward reward);

    ApiConditional deserializeConditional(JsonObject json);

    JsonObject serializeConditional(ApiConditional conditional);
}
