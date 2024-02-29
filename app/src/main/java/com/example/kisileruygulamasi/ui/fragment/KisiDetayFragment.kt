package com.example.kisileruygulamasi.ui.fragment

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding

class KisiDetayFragment : Fragment() {
    private lateinit var binding: FragmentKisiDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentKisiDetayBinding.inflate(inflater,container, false)


        binding.toolbarKisiDetay.title="Kisi Detayları"
        binding.toolbarKisiDetay.setTitleTextColor(Color.WHITE)

        val bundle:KisiDetayFragmentArgs by navArgs()
        val gelenKisi=bundle.kisi

        binding.editTextKisiAd.setText(gelenKisi.kisi_ad)
        binding.editTextKisiTel.setText(gelenKisi.kisi_Tel)

        binding.buttonGuncelle.setOnClickListener{
            val kisi_ad=binding.editTextKisiAd.text.toString()
            val kisi_tel=binding.editTextKisiTel.text.toString()
            guncelle(gelenKisi.kisi_id,kisi_ad,kisi_tel)
        }
        return binding.root
    }
        fun guncelle(kisiId:Int, kisiAd:String,kisiTel:String){
            Log.e("Kişi Güncelle","$kisiId- $kisiAd - $kisiTel")
        }

    }

