package com.example.oop

open class OpenClassPepel(
    val name: String,
    val age: Int,
    val skinColor: String
) {
    fun AgeIf(age: Int){
        if (age < 0 || age > 150){
            println("Nhap lai ngay sinh no khong hop le")
        }
        else {
            println("Thanh cong, ngay sinh $age hop le")
        }
    }
}