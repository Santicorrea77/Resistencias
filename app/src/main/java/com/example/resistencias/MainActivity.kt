package com.example.resistencias

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var c1 = ""
    private var c2 = ""
    private var c3 = ""
    private var c4 = ""

    private var num1 = 0.0
    private var res = 0.0
    private var resul = "2.2 K ohms - 10%"

    private var n1 = ""
    private var n2 = 0.0
    private var n3 = 0.0
    private var n4 = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = ArrayAdapter.createFromResource(this, R.array.resis_list, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        spinner1.adapter = adapter

        spinner2.adapter = adapter

        spinner3.adapter = adapter

        val adapter1 = ArrayAdapter.createFromResource(this, R.array.tole_list, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner4.adapter = adapter1

        button_cal.setOnClickListener {
            c1 = spinner1.selectedItem.toString()
            c1 = c1.take(1)

            c2 = spinner2.selectedItem.toString()
            c2 = c2.take(1)

            c3 = spinner3.selectedItem.toString()
            c3 = c3.take(1)

            c4 = spinner4.selectedItem.toString()
            c4 = c4.take(3)

            when (c1) {
                "0" -> {
                    tv_color1.setBackgroundColor(-16777216)
                }
                "1" -> {
                    tv_color1.setBackgroundColor(-4956410)
                }
                "2" -> {
                    tv_color1.setBackgroundColor(-65536)
                }
                "3" -> {
                    tv_color1.setBackgroundColor(-26368)
                }
                "4" -> {
                    tv_color1.setBackgroundColor(-256)
                }
                "5" -> {
                    tv_color1.setBackgroundColor(-16711936)
                }
                "6" -> {
                    tv_color1.setBackgroundColor(-16776961)
                }
                "7" -> {
                    tv_color1.setBackgroundColor(-65281)
                }
                "8" -> {
                    tv_color1.setBackgroundColor(-7829368)
                }
                "9" -> {
                    tv_color1.setBackgroundColor(-1)
                }
            }

            when (c2) {
                "0" -> {
                    tv_color2.setBackgroundColor(-16777216)
                }
                "1" -> {
                    tv_color2.setBackgroundColor(-4956410)
                }
                "2" -> {
                    tv_color2.setBackgroundColor(-65536)
                }
                "3" -> {
                    tv_color2.setBackgroundColor(-26368)
                }
                "4" -> {
                    tv_color2.setBackgroundColor(-256)
                }
                "5" -> {
                    tv_color2.setBackgroundColor(-16711936)
                }
                "6" -> {
                    tv_color2.setBackgroundColor(-16776961)
                }
                "7" -> {
                    tv_color2.setBackgroundColor(-65281)
                }
                "8" -> {
                    tv_color2.setBackgroundColor(-7829368)
                }
                "9" -> {
                    tv_color2.setBackgroundColor(-1)
                }
            }


            n1 = c1 + c2
            num1 = n1.toDouble()

            when (c3) {
                "0" -> {
                    res = num1
                    //val colorValue = ContextCompat.getColor(Context, R.color.green)
                    tv_color3.setBackgroundColor(-16777216)
                    //tv_color4.setBackgroundColor(R.color.green)
                }
                "1" -> {
                    res = num1 * 10
                    tv_color3.setBackgroundColor(-4956410)
                }
                "2" -> {
                    res = num1 * 100
                    tv_color3.setBackgroundColor(-65536)
                }
                "3" -> {
                    res = num1 * 1000
                    tv_color3.setBackgroundColor(-26368)
                }
                "4" -> {
                    res = num1 * 10000
                    tv_color3.setBackgroundColor(-256)
                }
                "5" -> {
                    res = num1 * 100000
                    tv_color3.setBackgroundColor(-16711936)
                }
                "6" -> {
                    res = num1 * 1000000
                    tv_color3.setBackgroundColor(-16776961)
                }
                "7" -> {
                    res = num1 * 10000000
                    tv_color3.setBackgroundColor(-65281)
                }
                "8" -> {
                    res = num1 * 100000000
                    tv_color3.setBackgroundColor(-7829368)
                }
                "9" -> {
                    res = num1 * 1000000000
                    tv_color3.setBackgroundColor(-1)
                }
            }

            if (res >= 1000 && res < 1000000) {
                n2 = res / 1000
                resul = n2.toString() + " k Ohms"

            } else if (res >= 1000000 && res < 1000000000) {
                n2 = res / 1000000
                resul = n2.toString() + " M Ohms"

            }
            else if (res >= 1000000000) {
                n2 = res / 1000000
                resul = n2.toString() + " M Ohms"
            } else {
                n2=res
                resul = n2.toString() + " Ohms"
            }


            when (c4) {
                "1% " -> {
                    tv_color4.setBackgroundColor(-4956410)
                    resul = resul + " - 1%"
                }
                "2% " -> {
                    tv_color4.setBackgroundColor(-65536)
                    resul = resul + " - 2%"
                }
                "5% " -> {
                    tv_color4.setBackgroundColor(-933326)
                    resul = resul + " - 5%"
                }
                "10%" -> {
                    tv_color4.setBackgroundColor(-3355444)
                    resul = resul + " - 10%"
                }}



            tv_resul.text = resul

        }


    }
}
