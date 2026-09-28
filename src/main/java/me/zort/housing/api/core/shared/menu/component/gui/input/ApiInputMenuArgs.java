package me.zort.housing.api.core.shared.menu.component.gui.input;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ApiInputMenuArgs {
    private String title;
    private String placeholder;
    private int minLength;
    private int maxLength;
    private ApiInputMenuCallback callback;
}
