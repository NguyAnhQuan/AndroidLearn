package com.example.oop

class SubPepleMan(peopleName: String, peopleAge: Int):
    OpenClassPepel(name = peopleName, age = peopleAge) {

    override val skinColor = "white"

    private var changeHeight by RangeRegulator(initialValue = 20, minValue = 0, maxValue = 150)
    private var changeWith by RangeRegulator(initialValue = 5, minValue = 0, maxValue = 50)

    fun changeHeight(){
        changeHeight ++
        println("Change height to $changeHeight")
    }

    fun changeWith(){
        changeWith ++
        println("Change with to $changeWith")
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

