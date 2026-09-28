package me.zort.housing.api.core.shared.lang;

import me.zort.housing.api.core.shared.economy.offer.ApiOffer;
import me.zort.housing.api.core.shared.lang.type.builtin.item.ApiItemLangEntry;
import me.zort.housing.api.core.shared.lang.type.builtin.item.ApiLangItem;
import me.zort.housing.api.core.shared.lang.type.builtin.message.ApiLangMessage;
import me.zort.housing.api.core.shared.lang.type.builtin.message.ApiMessageLangEntry;
import me.zort.housing.api.core.shared.lang.type.builtin.text.ApiLangText;
import me.zort.housing.api.core.shared.lang.type.builtin.text.ApiTextLangEntry;
import net.kyori.adventure.text.Component;

public interface ApiLang {

    ApiLangMessage getMessage(ApiMessageLangEntry entry);

    ApiLangItem getItem(ApiItemLangEntry entry);

    ApiLangText getText(ApiTextLangEntry entry);

    ApiLangText getOfferText(ApiOffer offer);

    String serializeMiniMessage(Component component);

    Component deserializeMiniMessage(String miniMessage);

    static ApiLang get() {
        return ApiLangProvider.getLang();
    }

    static ApiLangMessage message(ApiMessageLangEntry entry) {
        return ApiLangProvider.getLang().getMessage(entry);
    }

    static ApiLangItem item(ApiItemLangEntry entry) {
        return ApiLangProvider.getLang().getItem(entry);
    }

    static ApiLangText text(ApiTextLangEntry entry) {
        return ApiLangProvider.getLang().getText(entry);
    }

    static ApiLangText offer(ApiOffer offer) {
        return ApiLangProvider.getLang().getOfferText(offer);
    }
}
