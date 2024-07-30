package com.example.oop

class SubPepleMan(peopleName: String, peopleAge: Int, peopleSkinColor: String):
    OpenClassPepel(name = peopleName, age = peopleAge, skinColor = peopleSkinColor) {

    var AgePeople = 5
        set(value){
            if (value in 0..200){
                field = value
            }
        }
    var skinColorPeople = "yellow"
        set(value) {
            if (value == "white" || value == "black" || value == "yellow") {
                field = value
            }
        }
}