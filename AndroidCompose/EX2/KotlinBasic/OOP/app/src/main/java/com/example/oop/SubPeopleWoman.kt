package com.example.oop

class SubPeopleWoman(peopleName: String, peopleAge: Int):
    OpenClassPepel(name = peopleName, age = peopleAge){

    override val skinColor = "yellow"

    private var v1 by RangeRegulator(initialValue = 20, minValue = 10, maxValue = 80)
    private var v2 by RangeRegulator(initialValue = 15, minValue = 5, maxValue = 100)
    private var v3 by RangeRegulator(initialValue = 23, minValue = 10, maxValue = 85)

    fun changeV1(){
        v1 ++
        println("v1 tăng lên $v1")
    }

    fun changeV2(){
        v2 ++
        println("v2 tăng lên $v2")
    }

    fun changeV3(){
        v3 ++
        println("v3 tăng lên $v3")
    }

    override fun OpenEyes() {
        super.OpenEyes()
        println("$name ở tuổi $age đã mở mắt thành công")
    }

    override fun closeEyes() {
        super.closeEyes()
        println("$name ở tuổi $age đã đóng mắt thành công")
    }

}