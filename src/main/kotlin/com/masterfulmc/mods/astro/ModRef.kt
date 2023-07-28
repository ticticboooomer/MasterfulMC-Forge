package com.masterfulmc.mods.astro

import net.minecraft.resources.ResourceLocation

object ModRef {
    const val ID = "mcore"

    fun id(id: String) = ResourceLocation(ID, id)

    object Registry {
        val ATTRIBUTE_PARSER = id("space/attribute")

        object Space {
            val GROUPING_PARSER = id("space/grouping")

            val OBJECT_PARSER = id("space/object")

        }

        object Progress {
            val REQUIREMENT_PARSER = id("progress/requirement")
            val REWARD_PARSER = id("progress/reward")
            val SECTION_PARSER = id("progress/section")
        }
    }
}