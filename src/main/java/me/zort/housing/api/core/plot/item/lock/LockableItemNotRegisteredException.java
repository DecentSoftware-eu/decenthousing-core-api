package me.zort.housing.api.core.plot.item.lock;

public class LockableItemNotRegisteredException extends RuntimeException {

    public LockableItemNotRegisteredException() {
        super("Lockable item is not registered!");
    }
}
