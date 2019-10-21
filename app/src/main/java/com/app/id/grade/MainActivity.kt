package com.app.id.grade

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var nim: String = ""
    var nama: String  = ""
    var nilai: String  = ""
    var temp: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar?.setDisplayShowCustomEnabled(true)

        val inflator = this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = inflator.inflate(R.layout.logo_action, null)

        actionBar?.setCustomView(v)


        btnCek.setOnClickListener {

            nim = txtNim.text.toString()
            nama = txtNama.text.toString()
            nilai = txtNilai.text.toString()

            temp =  nilai.toInt()

            val a = ambilNilai.setNim(nim)
            val b = ambilNilai.setNama(nama)
            val c = ambilNilai.setNilai(nilai)

            Log.d("akhir ", temp.toString())

            if((temp >= 80) && (temp <= 100) ){
                val ket = ambilNilai.setKeterangan("A")
            }else if((temp >= 60) && (temp < 80)){
                val ket = ambilNilai.setKeterangan("B")
            }else if((temp >= 40) && (temp < 60)){
                val ket = ambilNilai.setKeterangan("C")
            }else if((temp >= 20) && (temp < 40)){
                val ket = ambilNilai.setKeterangan("D")
            }else if((temp >= 0) && (temp < 20)){
                val ket = ambilNilai.setKeterangan("E")
            }

            startActivity(Intent(this@MainActivity, penilaian::class.java))
        }



    }
}
