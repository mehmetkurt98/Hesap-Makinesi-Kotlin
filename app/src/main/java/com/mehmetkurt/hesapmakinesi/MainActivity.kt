package com.mehmetkurt.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.mehmetkurt.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var tasarim: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

    }

    fun btnSayiTik(view: View) {
        if (yeniOperator) {
            tasarim.sayiGoster.setText("")
        }
        yeniOperator = false
        var btnSec = view as Button
        var btnTikDeger: String = tasarim.sayiGoster.text.toString()
        when (btnSec.id) {
            tasarim.btn0.id -> {
                btnTikDeger += "0"
            }
            tasarim.btn1.id -> {
                btnTikDeger += "1"


            }
            tasarim.btn2.id -> {
                btnTikDeger += "2"


            }
            tasarim.btn3.id -> {
                btnTikDeger += "3"


            }
            tasarim.btn4.id -> {
                btnTikDeger += "4"


            }
            tasarim.btn5.id -> {
                btnTikDeger += "5"


            }
            tasarim.btn6.id -> {
                btnTikDeger += "6"


            }
            tasarim.btn7.id -> {
                btnTikDeger += "7"

            }
            tasarim.btn8.id -> {
                btnTikDeger += "8"

            }
            tasarim.btn9.id -> {
                btnTikDeger += "9"

            }
            tasarim.btnArtiEksi.id -> {
                btnTikDeger = "-" + btnTikDeger
            }
        }
        tasarim.sayiGoster.setText(btnTikDeger)

    }

    var operator = "*"
    var eskiSayi = ""
    var yeniOperator = true

    fun btnOpTik(view: View) {
        var btnSec = view as Button
        when (btnSec.id) {
            tasarim.btnTopla.id -> {
                operator = "+"

            }
        }
        eskiSayi = tasarim.sayiGoster.text.toString()
        yeniOperator = true
    }
    fun btnEsittirTik(view: View) {
        var yeniSayi = tasarim.sayiGoster.text.toString()
        var sonucSayisi: Double?=null
        when (operator) {
            "+" -> {
                sonucSayisi = eskiSayi.toDouble() + yeniSayi.toDouble()
            }
        }
        tasarim.sayiGoster.setText(sonucSayisi.toString())
        yeniOperator = true

    }
    fun btnSilTik(view: View){
        tasarim.sayiGoster.setText("0")
        yeniOperator=true
    }
}
