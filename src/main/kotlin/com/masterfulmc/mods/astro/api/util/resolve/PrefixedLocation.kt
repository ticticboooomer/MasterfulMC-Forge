package com.masterfulmc.mods.astro.api.util.resolve

import net.minecraft.resources.ResourceLocation

data class PrefixedLocation(
    val rl: ResourceLocation
) {
    private val prefix: ResourceLocation
    private val suffix: String
    init {
        val split = rl.path.split("/")
        if (split.size <= 2) {
            error("Prefixed Resource Locations must have at least 3 segments, here is an example: (modid:area/group/whateveryouwant/and/some/more/if/needed)")
        }
        prefix = ResourceLocation(rl.namespace, "${split[0]}/${split[1]}")
        val suffixSplitLength = split.size
        suffix = split.subList(2, suffixSplitLength).joinToString("/")
    }
}