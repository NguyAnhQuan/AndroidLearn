package com.example.oop

class People(
    val girl: SubPeopleWoman,
    val boy: SubPepleMan
) {

    var PeopleOpenEye = 0
        private set

    fun OpenAllEyes(){
        girl.OpenEyes()
        boy.OpenEyes()
        PeopleOpenEye ++
    }

    fun CloseAllEyes(){
        girl.closeEyes()
        boy.closeEyes()
        PeopleOpenEye --
    }

    fun BoyChangeHeight(){
        boy.changeHeight()
    }

    fun BoyChangeWith(){
        boy.changeWith()
    }

    fun changeV1(){
        girl.changeV1()
    }

    fun changeV2() {
        girl.changeV2()
    }

    fun changeV3() {
        girl.changeV3()
    }

    fun BoyOpenEye(){
        boy.OpenEyes()
        PeopleOpenEye ++
    }

    fun BoyCloseEye(){
        boy.closeEyes()
        PeopleOpenEye --
    }

    fun GirlOpenEye(){
        girl.OpenEyes()
        PeopleOpenEye ++
    }

    fun GirlCloseEye(){
        girl.closeEyes()
        PeopleOpenEye --
    }
}