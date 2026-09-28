package me.zort.housing.api.core.plot.item.lock;

import me.zort.housing.api.core.plot.item.ApiItem;

public interface ApiLockableItem extends ApiItem {

    String getId();

    String getTag();

    /**
     * Called when the item is unlocked.
     */
    default void onUnlock() {
    }
}
