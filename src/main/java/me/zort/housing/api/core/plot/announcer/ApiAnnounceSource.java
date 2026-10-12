package me.zort.housing.api.core.plot.announcer;

import me.zort.housing.api.core.shared.user.ApiUser;
import net.kyori.adventure.text.Component;

public interface ApiAnnounceSource {

    Component getAnnouncementText(ApiUser user);

    boolean canAnnounce(ApiUser user);

    int getPriority();
}
