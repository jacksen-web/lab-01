package com.example.petshop

class Happy(name:String,date:String) : Mood(name,date) {
    override fun mood(): String {
        return "$name felt happy on $date."
    }
}