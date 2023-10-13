package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SuperHero(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val heroesDescription: Int,
    @StringRes val vulnerability: Int,
    @StringRes val vulnerabilityDetail: Int
)
