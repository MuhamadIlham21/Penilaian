package com.app.id.grade

object ambilNilai {
    var getNim: String = ""
    var getNama: String = ""
    var getNilai: String = ""
    var getKeterangan: String = ""

    fun setNim(getNim: String):String{
        this.getNim = getNim
        return getNim
    }

    fun setNama(getNama: String):String{
        this.getNama = getNama
        return getNama
    }

    fun setNilai(getNilai: String):String{
        this.getNilai = getNilai
        return getNilai
    }

    fun setKeterangan(getKeterangan: String):String{
        this.getKeterangan = getKeterangan
        return getKeterangan
    }
}