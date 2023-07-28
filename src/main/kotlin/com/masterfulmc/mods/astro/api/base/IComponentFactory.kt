package com.masterfulmc.mods.astro.api.base

interface IComponentFactory<T : IComponent<T>> {
    fun resolveReferences()
    fun createParts(): List<T>
}