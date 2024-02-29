package com.example.kisileruygulamasi.ui.fragment

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kisileruygulamasi.R
import com.example.kisileruygulamasi.databinding.FragmentKisiDetayBinding
import com.example.kisileruygulamasi.databinding.FragmentKisiKayitBinding

class KisiKayitFragment : Fragment() {
    private lateinit var binding:FragmentKisiKayitBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding= FragmentKisiKayitBinding.inflate(inflater,container, false)

        binding.toolbarKisiKayit.title="Kişi Kayıt"
        binding.toolbarKisiKayit.setTitleTextColor(Color.WHITE)
        binding.buttonKaydet.setOnClickListener{
            val kisiAd=binding.editTextKisiAd.text.toString()
            val kisiTel=binding.editTextKisiTel.text.toString()
            kaydet(kisiAd,kisiTel)

        }

        return binding.root
    }
    fun kaydet(kisiAd:String,kisiTel:String){
        Log.e("Kişi Kaydet","$kisiAd - $kisiTel")
    }
    }

