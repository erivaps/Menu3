package com.kotlin.menu3.menu3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tbGroupEntrada.visibility = View.INVISIBLE //INVISIBLE
        tbGroupSegundo.visibility = View.INVISIBLE //INVISIBLE
    }

    fun visibleEntrada(view :View){
        if (chkEntrada.isChecked) {
            tbGroupEntrada.visibility = View.VISIBLE
        } else {
            tbGroupEntrada.visibility = View.INVISIBLE
        }
    }
    fun visibleSegundo(view :View){
        if (chkSegundo.isChecked) {
            tbGroupSegundo.visibility = View.VISIBLE
        } else {
            tbGroupSegundo.visibility = View.INVISIBLE
        }
    }
    fun ordenar(view : View) {

        var resultado = ""

        txtOrdered.setText("")
        if (chkEntrada.isChecked) {
            var id: Int = tbGroupEntrada.checkedRadioButtonId
            if (id != -1) {
                val radio: RadioButton = findViewById(id)
                resultado += "Entrada: " + radio.text.toString()

            } else {
                txtOrdered.setText(R.string.txtNoSelect)
            }
        }

        if (chkSegundo.isChecked) {

            var id2: Int = tbGroupSegundo.checkedRadioButtonId
            if (id2 != -1) {
                val radio2: RadioButton = findViewById(id2)
                resultado += "\n Segundo: " + radio2.text.toString()
                //txtOrdered.setText("Segundo: " + radio2.text.toString())

            } else {
                //txtOrdered.setText(R.string.txtNoSelect)
            }
        }
        txtOrdered.setText(resultado)

    }
}
