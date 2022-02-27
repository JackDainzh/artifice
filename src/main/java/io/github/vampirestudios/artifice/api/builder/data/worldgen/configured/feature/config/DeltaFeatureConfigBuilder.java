package io.github.vampirestudios.artifice.api.builder.data.worldgen.configured.feature.config;

import com.google.gson.JsonObject;
import io.github.vampirestudios.artifice.api.builder.data.StateDataBuilder;
import io.github.vampirestudios.artifice.api.builder.data.worldgen.UniformIntDistributionBuilder;
import io.github.vampirestudios.artifice.api.util.Processor;

public class DeltaFeatureConfigBuilder extends FeatureConfigBuilder {

    public DeltaFeatureConfigBuilder() {
        super();
    }

    public DeltaFeatureConfigBuilder size(Processor<UniformIntDistributionBuilder> processor) {
        with("size", JsonObject::new, jsonObject -> processor.process(new UniformIntDistributionBuilder()).buildTo(jsonObject));
        return this;
    }

    public DeltaFeatureConfigBuilder rimSize(Processor<UniformIntDistributionBuilder> processor) {
        with("rim_size", JsonObject::new, jsonObject -> processor.process(new UniformIntDistributionBuilder()).buildTo(jsonObject));
        return this;
    }

    public DeltaFeatureConfigBuilder rim(StateDataBuilder processor) {
        with("rim", JsonObject::new, processor::merge);
        return this;
    }

    public DeltaFeatureConfigBuilder contents(StateDataBuilder processor) {
        with("contents", JsonObject::new, processor::merge);
        return this;
    }
}
