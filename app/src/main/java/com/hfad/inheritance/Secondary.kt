package com.hfad.inheritance

//Производный класс
open class Secondary: BaseClass() {
    override fun role() {
         super.role()
        println("Knight of the House of Baseclass")
    }
}