package com.app.id.grade

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_penilaian.*

class penilaian : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penilaian)

        val actionBar = supportActionBar
        actionBar?.setDisplayShowCustomEnabled(true)

        val inflator = this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = inflator.inflate(R.layout.logo_action, null)

        actionBar?.setCustomView(v)

        val a = ambilNilai.getNim
        val b = ambilNilai.getNama
        val c = ambilNilai.getNilai
        val d = ambilNilai.getKeterangan

        tvNim.setText(a).toString()
        tvNama.setText(b).toString()
        tvNilai.setText(c).toString()
        tvKeterangan.setText(d).toString()
    }
}
