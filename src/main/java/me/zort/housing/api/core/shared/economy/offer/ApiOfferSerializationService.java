package me.zort.housing.api.core.shared.economy.offer;

import com.google.gson.JsonObject;

public interface ApiOfferSerializationService {

    ApiOffer deserialize(JsonObject json);

    JsonObject serialize(ApiOffer offer);
}
