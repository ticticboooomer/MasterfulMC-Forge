package com.masterfulmc.mods.astro.api.util.resolve

import net.minecraft.resources.ResourceLocation

class LazyReference<T : Any>(
    id: ResourceLocation,
    private val resolver: ResolvableRegistry.Resolver<T>
) {
    private val id = PrefixedLocation(id)
    private var value: T? = null
    private var isResolved = false
    fun get(): T {
        if (isResolved && value == null) {
            error("Value for $id cannot be resolved!")
        } else if (!isResolved) {
            value = resolver.resolve()
            isResolved = true
        }
        return value ?: error("Something has seriously Broken: This should never hit EVER!")
    }

    fun id() = id
}