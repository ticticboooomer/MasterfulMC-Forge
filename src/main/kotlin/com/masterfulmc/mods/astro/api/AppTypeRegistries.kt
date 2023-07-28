package com.masterfulmc.mods.astro.api

import com.masterfulmc.mods.astro.ModRef
import com.masterfulmc.mods.astro.api.base.attr.IAttributeFactoryParser
import com.masterfulmc.mods.astro.api.progress.requirement.IRequirementFactoryParser
import com.masterfulmc.mods.astro.api.progress.reward.IRewardFactoryParser
import com.masterfulmc.mods.astro.api.progress.section.IQuestSectionFactoryParser
import com.masterfulmc.mods.astro.api.space.piece.group.IGroupingFactoryParser
import com.masterfulmc.mods.astro.api.space.piece.obj.ISpaceObjectFactoryParser
import com.masterfulmc.mods.astro.api.util.resolve.ResolvableRegistry
import net.minecraft.resources.ResourceLocation

object AppTypeRegistries {
    private fun <T : Any> createRegistry(key: ResourceLocation): ResolvableRegistry<T> {
        return ResolvableRegistry(key)
    }

    // CORE
    val ALL = mutableMapOf<ResourceLocation, ResolvableRegistry<out Any>>()

    val ATTRIBUTES = createRegistry<IAttributeFactoryParser>(ModRef.Registry.ATTRIBUTE_PARSER)

    // SPACE
    val GROUPINGS = createRegistry<IGroupingFactoryParser>(ModRef.Registry.Space.GROUPING_PARSER)
    val SPACE_OBJECTS = createRegistry<ISpaceObjectFactoryParser>(ModRef.Registry.Space.OBJECT_PARSER)

    // PROGRESS
    val REQUIREMENTS = createRegistry<IRequirementFactoryParser>(ModRef.Registry.Progress.REQUIREMENT_PARSER)
    val REWARDS = createRegistry<IRewardFactoryParser>(ModRef.Registry.Progress.REWARD_PARSER)
    val SECTIONS = createRegistry<IQuestSectionFactoryParser>(ModRef.Registry.Progress.SECTION_PARSER)

    // MACHINES
    // - Research
    // - General Processing
    // - Crafting
    // - Mining
    // - Resource Generation?

    // MATERIALS
    // - Fixed (created at game-load)
    // - Generated (created at world-load)
    // - Fluids
    // - Items
    // - Blocks
    // - Entities????

    // GENERATORS
    // - Planet World Gen
    // \ - Biomes
    // \ - Ores
    // \ - Noises
    // \ - Sounds
    // \ - Mobs / Life??????
    // \ - Rivers / Oceans / Ponds / etc.

    // ROCKETRY
    // - Fuels
    // - Engines
    // - Structures / Formations
    // - Modular Structure Components
    // - Suits
    // - Upgrades (Attachments)



}