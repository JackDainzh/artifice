package io.github.vampirestudios.artifice.api.builder.data.worldgen.configured.decorator.config;

import net.minecraft.world.level.levelgen.GenerationStep;

public class CarvingMaskDecoratorConfigBuilder extends DecoratorConfigBuilder {

	public CarvingMaskDecoratorConfigBuilder() {
		super();
	}

	public CarvingMaskDecoratorConfigBuilder probability(float probability) {
		this.root.addProperty("probability", probability);
		return this;
	}

	public CarvingMaskDecoratorConfigBuilder step(GenerationStep.Carving step) {
		this.root.addProperty("step", step.getName());
		return this;
	}
}
