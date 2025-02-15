package io.github.vampirestudios.artifice.api.builder.data.recipe;

import com.google.gson.JsonObject;
import io.github.vampirestudios.artifice.api.builder.TypedJsonObject;
import net.minecraft.resources.ResourceLocation;

/**
 * Base builder for a recipe ({@code namespace:recipes/id.json}).
 * @param <T> this
 * @see <a href="https://minecraft.gamepedia.com/Recipe#JSON_format" target="_blank">Minecraft Wiki</a>
 */
@SuppressWarnings("unchecked")
public abstract class RecipeBuilder<T extends RecipeBuilder<T>> extends TypedJsonObject {
    public String rootFolder;
    protected RecipeBuilder() { super(new JsonObject()); }

    /**
     * Set the type of this recipe.
     * @param id The type ID.
     * @return this
     */
    public T type(ResourceLocation id) {
        root.addProperty("type", id.toString());
        return (T)this;
    }

    /**
     * Set the recipe book group of this recipe.
     * @param id The group ID.
     * @return this
     */
    public T group(ResourceLocation id) {
        root.addProperty("group", id.toString());
        return (T)this;
    }

    public T rootFolder(String id) {
        this.rootFolder = id;
        return (T)this;
    }
}
