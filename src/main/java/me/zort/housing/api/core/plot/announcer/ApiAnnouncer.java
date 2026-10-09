package me.zort.housing.api.core.plot.announcer;

public interface ApiAnnouncer {

    void addSourceIfAbsent(ApiAnnounceSource source);

    void addSource(ApiAnnounceSource source);

    void removeSource(ApiAnnounceSource source);

    boolean hasSource(ApiAnnounceSource source);
}
