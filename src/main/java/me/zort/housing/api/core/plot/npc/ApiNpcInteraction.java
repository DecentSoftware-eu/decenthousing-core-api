package me.zort.housing.api.core.plot.npc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.zort.housing.api.core.shared.user.ApiUser;

@Getter
@AllArgsConstructor
public class ApiNpcInteraction {
    private final ApiUser user;
}
