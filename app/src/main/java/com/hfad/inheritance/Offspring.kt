package com.hfad.inheritance
//Интерфейсы можно наследовать через запятую
class Offspring: Secondary(),Archer,Singer {
    override fun archery() {
        super.archery()
        println("Archery skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by Offspring")
    }
}