package com.masterfulmc.mods.astro.api.util.resolve

import com.masterfulmc.mods.astro.api.AppTypeRegistries
import net.minecraft.resources.ResourceLocation

class ResolvableRegistry<T : Any>(key: ResourceLocation) {
    init {
        AppTypeRegistries.ALL[key] = this
    }

    val registry = mutableMapOf<ResourceLocation, T>()
    fun register(key: ResourceLocation, value: T) {
        registry[key] = value
    }
    fun createLazyReference(id: ResourceLocation): LazyReference<T> {
        return LazyReference(id) {
            registry[id] ?: error("Could not find registry entry for $id")
        }
    }

    fun interface Resolver<T: Any> {
        fun resolve(): T
    }
}