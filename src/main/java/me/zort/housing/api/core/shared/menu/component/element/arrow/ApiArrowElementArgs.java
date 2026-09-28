package me.zort.housing.api.core.shared.menu.component.element.arrow;

import lombok.Builder;
import lombok.Getter;
import me.zort.containr.PagedContainer;

@Getter
@Builder
public class ApiArrowElementArgs {
    private ApiArrowElementDirection direction;
    private ApiArrowElementType type;
    private PagedContainer container;
}
