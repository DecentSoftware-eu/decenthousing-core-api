package me.zort.housing.api.core.plot.npc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiNpcSkin {
    private String value;
    private String signature;

    public ApiNpcSkin copy() {
        return new ApiNpcSkin(value, signature);
    }
}
