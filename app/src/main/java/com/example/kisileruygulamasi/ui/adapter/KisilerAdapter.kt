package com.example.kisileruygulamasi.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.databinding.CardTasarimBinding
import com.example.kisileruygulamasi.ui.fragment.AnasayfaFragmentDirections
import com.google.android.material.snackbar.Snackbar

class KisilerAdapter(var mContext: Context,var kisilerListesi: List<Kisiler>):RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding=CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        //Kart yapısıyla ilgili işlemler burada yapılır
        val kisi=kisilerListesi.get(position)
        val t=holder.tasarim

        t.textViewKisiAd.text=kisi.kisi_ad
        t.textViewKisiTel.text=kisi.kisi_Tel

        t.cardViewSatir.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.kisiDetayGetir(kisi=kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

        t.imageViewSil.setOnClickListener{
            Snackbar.make(it,"${kisi.kisi_ad} kişisini silmek isteğinizden emin misiniz?",Snackbar.LENGTH_LONG)
                .setAction("EVET"){
                    sil(kisi.kisi_id)
                }
                .show()
        }
    }


    override fun getItemCount(): Int {
        return kisilerListesi.size
    }
    fun sil(kisi_id:Int){
        Log.e("Kişi Sil",kisi_id.toString())
    }

}