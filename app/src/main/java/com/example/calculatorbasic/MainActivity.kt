package com.example.calculatorbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var x:Double?=null
    var y:Double?=null
    var result:Double?=null



    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun pluss(view: View){
        var x=firstText.text.toString().toDoubleOrNull()
        var y=secondText.text.toString().toDoubleOrNull()

        if (x==null || y ==null){
            resultText.text="You need to enter two number"
        }else{
            val result=x!!+y!!
            resultText.text="Sonuc ${result.toString()}"
        }



    }
    fun minuss(view: View){
        var x=firstText.text.toString().toDoubleOrNull()
        var y=secondText.text.toString().toDoubleOrNull()
        if (x==null || y ==null){
            resultText.text="You need to enter two number"
        }else{
            val result=x!!-y!!
            resultText.text="Sonuc ${result.toString()}"
        }



    }
    fun dividee(view: View){
        var x=firstText.text.toString().toDoubleOrNull()
        var y=secondText.text.toString().toDoubleOrNull()
        if (x==null || y ==null){
            resultText.text="You need to enter two number"
        }else{
            val result=x!!/y!!
            resultText.text="Result: ${result.toString()}"
        }




    }
    fun multiplyy(view: View){
        var x=firstText.text.toString().toDoubleOrNull()
        var y=secondText.text.toString().toDoubleOrNull()
        if (x==null || y ==null){
            resultText.text="You need to enter two number"
        }else{
            val result=x!!*y!!
            resultText.text="Result: ${result.toString()}"
        }



    }


}