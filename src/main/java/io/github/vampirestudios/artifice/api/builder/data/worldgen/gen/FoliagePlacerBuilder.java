package io.github.vampirestudios.artifice.api.builder.data.worldgen.gen;

import com.google.gson.JsonObject;
import io.github.vampirestudios.artifice.api.builder.TypedJsonObject;
import io.github.vampirestudios.artifice.api.builder.data.worldgen.UniformIntDistributionBuilder;

public class FoliagePlacerBuilder extends TypedJsonObject {

    public FoliagePlacerBuilder() {
        super(new JsonObject());
    }

    public <P extends FoliagePlacerBuilder> P type(String type) {
        this.root.addProperty("type", type);
        return (P)this;
    }

    public <P extends FoliagePlacerBuilder> P radius(int radius) {
        this.root.addProperty("radius", radius);
        return (P) this;
    }

    public <P extends FoliagePlacerBuilder> P radius(UniformIntDistributionBuilder processor) {
        join("radius", processor.build());
        return (P) this;
    }

    public <P extends FoliagePlacerBuilder> P offset(int offset) {
        this.root.addProperty("offset", offset);
        return (P) this;
    }

    public <P extends FoliagePlacerBuilder> P offset(UniformIntDistributionBuilder processor) {
        join("offset", processor.build());
        return (P) this;
    }

    public static class BlobFoliagePlacerBuilder extends FoliagePlacerBuilder {

        public BlobFoliagePlacerBuilder() {
            super();
            this.type("minecraft:blob_foliage_placer");
        }

        public <P extends BlobFoliagePlacerBuilder> P height(int height) {
            if (height > 16) throw new IllegalArgumentException("Height can't be higher than 16! Found " + height);
            if (height < 0) throw new IllegalArgumentException("Height can't be smaller than 0! Found " + height);
            this.root.addProperty("height", height);
            return (P) this;
        }
    }

    public static class SpruceFoliagePlacerBuilder extends FoliagePlacerBuilder {

        public SpruceFoliagePlacerBuilder() {
            super();
            this.type("minecraft:spruce_foliage_placer");
        }

        public SpruceFoliagePlacerBuilder trunkHeight(int trunkHeight) {
            this.root.addProperty("trunk_height", trunkHeight);
            return this;
        }

        public SpruceFoliagePlacerBuilder trunkHeight(UniformIntDistributionBuilder processor) {
            join("trunk_height", processor.build());
            return this;
        }
    }

    public static class PineFoliagePlacerBuilder extends FoliagePlacerBuilder {

        public PineFoliagePlacerBuilder() {
            super();
            this.type("minecraft:pine_foliage_placer");
        }

        public PineFoliagePlacerBuilder trunkHeight(int offset) {
            this.root.addProperty("trunk_height", offset);
            return this;
        }

        public PineFoliagePlacerBuilder trunkHeight(UniformIntDistributionBuilder processor) {
            join("trunk_height", processor.build());
            return this;
        }
    }

    public static class AcaciaFoliagePlacerBuilder extends FoliagePlacerBuilder {

        public AcaciaFoliagePlacerBuilder() {
            super();
            this.type("minecraft:acacia_foliage_placer");
        }
    }

    public static class BushFoliagePlacerBuilder extends BlobFoliagePlacerBuilder {

        public BushFoliagePlacerBuilder() {
            super();
            this.type("minecraft:bush_foliage_placer");
        }
    }

    public static class FancyFoliagePlacerBuilder extends BlobFoliagePlacerBuilder {

        public FancyFoliagePlacerBuilder() {
            super();
            this.type("minecraft:fancy_foliage_placer");
        }
    }

    public static class JungleFoliagePlacerBuilder extends FoliagePlacerBuilder {

        public JungleFoliagePlacerBuilder() {
            super();
            this.type("minecraft:jungle_foliage_placer");
        }

        public JungleFoliagePlacerBuilder height(int height) {
            if (height > 16) throw new IllegalArgumentException("Height can't be higher than 16! Found " + height);
            if (height < 0) throw new IllegalArgumentException("Height can't be smaller than 0! Found " + height);
            this.root.addProperty("height", height);
            return this;
        }
    }

    public static class MegaPineFoliagePlacerBuilder extends FoliagePlacerBuilder {

        public MegaPineFoliagePlacerBuilder() {
            super();
            this.type("minecraft:mega_pine_foliage_placer");
        }

        public MegaPineFoliagePlacerBuilder crownHeight(int crownHeight) {
            this.root.addProperty("crown_height", crownHeight);
            return this;
        }

        public MegaPineFoliagePlacerBuilder crownHeight(UniformIntDistributionBuilder processor) {
            join("crown_height", processor.build());
            return this;
        }
    }

    public static class DarkOakFoliagePlacerBuilder extends FoliagePlacerBuilder {

        public DarkOakFoliagePlacerBuilder() {
            super();
            this.type("minecraft:dark_oak_foliage_placer");
        }
    }
}
