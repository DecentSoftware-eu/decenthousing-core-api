package me.zort.housing.api.core.plot.subject;

import com.google.gson.JsonObject;
import me.zort.housing.api.core.plot.subject.conditional.ApiConditional;

public interface ApiRewardSerializerService {

    ApiConditional deserializeConditional(JsonObject json);

    JsonObject serializeConditional(ApiConditional conditional);
}
