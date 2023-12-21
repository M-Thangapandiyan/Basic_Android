package com.example.constraintbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import java.io.Serializable

data class EmployeeModel (
    val name: String?= null,
    val phoneNumber: String?= null,
    val mail: String?= null,
    val address: String?= null,
    val pinCode: String?= null,
    val message: String = "Employee Not Found"
)


