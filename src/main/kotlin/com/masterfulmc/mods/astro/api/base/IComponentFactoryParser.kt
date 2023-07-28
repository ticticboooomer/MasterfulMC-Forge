package com.masterfulmc.mods.astro.api.base

import com.google.gson.JsonObject
import net.minecraft.resources.ResourceLocation

interface IComponentFactoryParser<T : IComponent<T>> {
    fun parse(data: JsonObject): IComponentFactory<T>
    fun getPossibleAttributeTypes(): List<ResourceLocation>
}