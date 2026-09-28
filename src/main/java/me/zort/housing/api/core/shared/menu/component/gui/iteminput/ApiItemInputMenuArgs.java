package me.zort.housing.api.core.shared.menu.component.gui.iteminput;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiItemInputMenuArgs {
    private String title;
    private ApiItemInputMenuCallback callback;
}
