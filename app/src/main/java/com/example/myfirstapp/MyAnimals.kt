package com.example.myfirstapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class MyAnimals(val name: String, val desc: String, val numberOfAnimal: Int) : Parcelable
