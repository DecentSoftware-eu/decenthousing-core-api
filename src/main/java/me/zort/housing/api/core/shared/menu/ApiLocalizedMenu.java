package me.zort.housing.api.core.shared.menu;

import lombok.Getter;
import me.zort.containr.builder.PatternGUIBuilder;
import me.zort.housing.api.core.shared.HousingApi;
import me.zort.housing.api.core.shared.lang.type.builtin.menu.ApiMenuDefLangEntry;
import org.bukkit.entity.Player;

import java.util.Objects;
import java.util.function.Function;

@Getter
public abstract class ApiLocalizedMenu implements ApiMenu {
    private final ApiMenuDefLangEntry defEntry;

    private Function<String, String> titleCustomizer = Function.identity();

    protected ApiLocalizedMenu(ApiMenuDefLangEntry defEntry) {
        this.defEntry = Objects.requireNonNull(defEntry);
    }

    public abstract void init(PatternGUIBuilder builder, Player player);

    /**
     * Sets a custom title customizer for this menu.
     * The function takes the default title as input and returns the customized title.
     *
     * @param titleCustomizer the function to customize the menu title
     */
    public void setTitleCustomizer(Function<String, String> titleCustomizer) {
        this.titleCustomizer = Objects.requireNonNull(titleCustomizer);
    }

    @Override
    public void open(Player player) {
        HousingApi api = HousingApi.getApi();

        api.getMenuFactory().createLocalizedMenu(this).open(player);
    }
}
