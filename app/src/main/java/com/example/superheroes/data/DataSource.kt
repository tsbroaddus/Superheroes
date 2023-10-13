package com.example.superheroes.data

import com.example.superheroes.R
import com.example.superheroes.model.SuperHero

object DataSource {
    val superHeroes = listOf(
        SuperHero(R.drawable.android_superhero1, R.string.hero1, R.string.description1, R.string.vuln1, R.string.vulndetail1),
        SuperHero(R.drawable.android_superhero2, R.string.hero2, R.string.description2, R.string.vuln2, R.string.vulndetail2),
        SuperHero(R.drawable.android_superhero3, R.string.hero3, R.string.description3, R.string.vuln3, R.string.vulndetail3),
        SuperHero(R.drawable.android_superhero4, R.string.hero4, R.string.description4, R.string.vuln4, R.string.vulndetail4),
        SuperHero(R.drawable.android_superhero5, R.string.hero5, R.string.description5, R.string.vuln5, R.string.vulndetail5),
        SuperHero(R.drawable.android_superhero6, R.string.hero6, R.string.description6, R.string.vuln6, R.string.vulndetail6)

    )
}