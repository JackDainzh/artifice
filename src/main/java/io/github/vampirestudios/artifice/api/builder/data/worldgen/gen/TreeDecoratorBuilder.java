package io.github.vampirestudios.artifice.api.builder.data.worldgen.gen;

import com.google.gson.JsonObject;
import io.github.vampirestudios.artifice.api.builder.TypedJsonObject;
import io.github.vampirestudios.artifice.api.builder.data.worldgen.BlockStateProviderBuilder;

public class TreeDecoratorBuilder extends TypedJsonObject {

    public TreeDecoratorBuilder() {
        super(new JsonObject());
    }

    public <D extends TreeDecoratorBuilder> D type(String type) {
        this.root.addProperty("type", type);
        return (D) this;
    }

    public static class TrunkVineTreeDecoratorBuilder extends TreeDecoratorBuilder {

        public TrunkVineTreeDecoratorBuilder() {
            super();
            this.type("minecraft:trunk_vine");
        }
    }

    public static class LeaveVineTreeDecoratorBuilder extends TreeDecoratorBuilder {

        public LeaveVineTreeDecoratorBuilder() {
            super();
            this.type("minecraft:leave_vine");
        }
    }

    public static class CocoaTreeDecoratorBuilder extends TreeDecoratorBuilder {

        public CocoaTreeDecoratorBuilder() {
            super();
            this.type("minecraft:cocoa");
        }

        public CocoaTreeDecoratorBuilder probability(float probability) {
            if (probability > 1.0F) throw new IllegalArgumentException("probability can't be higher than 1.0F! Found " + probability);
            if (probability < 0.0F) throw new IllegalArgumentException("probability can't be smaller than 0.0F! Found " + probability);
            this.root.addProperty("probability", probability);
            return this;
        }
    }

    public static class BeeHiveTreeDecoratorBuilder extends TreeDecoratorBuilder {

        public BeeHiveTreeDecoratorBuilder() {
            super();
            this.type("minecraft:beehive");
        }

        public BeeHiveTreeDecoratorBuilder probability(float probability) {
            if (probability > 1.0F) throw new IllegalArgumentException("probability can't be higher than 1.0F! Found " + probability);
            if (probability < 0.0F) throw new IllegalArgumentException("probability can't be smaller than 0.0F! Found " + probability);
            this.root.addProperty("probability", probability);
            return this;
        }
    }

    public static class AlterGroundTreeDecoratorBuilder extends TreeDecoratorBuilder {

        public AlterGroundTreeDecoratorBuilder() {
            super();
            this.type("minecraft:alter_ground");
        }

        public <P extends BlockStateProviderBuilder> AlterGroundTreeDecoratorBuilder provider(P processor) {
            join("provider", processor.build());
            return this;
        }
    }
}
