package com.example.myfirstapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Figure(var name: String, var width: Int, var height: Int) : Parcelable {
    var area: Int = this.width * this.height
        private set
}
