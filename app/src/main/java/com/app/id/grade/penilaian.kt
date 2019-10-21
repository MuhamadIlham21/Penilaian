package com.app.id.grade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_penilaian.*

class penilaian : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penilaian)

        supportActionBar?.title = "Hasil"

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
