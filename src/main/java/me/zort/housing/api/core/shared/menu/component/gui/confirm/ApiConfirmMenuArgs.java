package me.zort.housing.api.core.shared.menu.component.gui.confirm;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiConfirmMenuArgs {
    private String title;
    private ApiConfirmMenuCallback callback;
}
