package com.malikazizali.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_umur.*

class UmurFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_umur, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataUser = arguments?.getString("username")
        val umurUser = arguments?.getString("thnLahir")

        val umurSaatIni = 2022-umurUser!!.toInt()

        tv_umur_nama.text = "Halo, $dataUser !"
        tv_umur.text = "Umur kamu $umurSaatIni tahun"
    }
}