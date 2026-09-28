package me.zort.housing.api.core.shared.menu;

import me.zort.containr.Element;
import me.zort.containr.builder.PatternGUIBuilder;
import me.zort.housing.api.core.shared.menu.component.element.arrow.ApiArrowElementArgs;
import org.jetbrains.annotations.Nullable;

public interface ApiMenuElementFactory {

    Element createArrowElement(ApiArrowElementArgs args);

    Element createGoBackElement(@Nullable ApiMenu menu);

    Element createNoItemsElement(@Nullable String text);

    PatternGUIBuilder.ElementFactory wrapLocalizedElement(ApiLocalizedMenu holder, String mark, Element element);

    PatternGUIBuilder.ElementFactory wrapLocalizedElement(ApiLocalizedMenu holder, String mark, PatternGUIBuilder.ElementFactory elementFactory);
}
