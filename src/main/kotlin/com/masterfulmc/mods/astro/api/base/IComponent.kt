package com.masterfulmc.mods.astro.api.base

interface IComponent<T : IComponent<T>> {
    fun getParent(): IComponent<T>
    fun hasParent(): Boolean {
        return true
    }
}