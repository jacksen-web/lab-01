package com.example.petshop

class Sad(name:String,date:String) : Mood(name,date) {
    override fun mood(): String {
        return "$name felt sad on $date."
    }
}