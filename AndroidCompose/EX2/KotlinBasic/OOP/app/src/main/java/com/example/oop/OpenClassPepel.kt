package com.example.oop

open class OpenClassPepel(
    val name: String,
    val age: Int

) {
    open val skinColor: String? = "unknow"
    var EyeStatus: String? = null

    open fun OpenEyes(){
        EyeStatus = "Mở mắt"
    }

    open fun closeEyes(){
        EyeStatus = "Đóng mắt"
    }
}