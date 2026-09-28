package me.zort.housing.api.core.plot.item.lock;

public interface ApiItemLockService {

    boolean isUnlocked(ApiLockableItem item);
}
