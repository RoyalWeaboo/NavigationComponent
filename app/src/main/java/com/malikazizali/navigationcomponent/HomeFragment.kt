package com.malikazizali.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataUser = arguments?.getString("username")
        val dataNama = arguments?.getString("nama")
        val dataPass = arguments?.getString("pass")

        tv_greeting.text = "Halo, $dataUser !"

        btn_hitung_umur.setOnClickListener {
            val dataTahunLahir = et_tahunLahir.text.toString()

            val bund = Bundle()
            bund.putString("username", dataUser)
            bund.putString("thnLahir", dataTahunLahir)
            Navigation.findNavController(view)
                .navigate(R.id.action_homeFragment_to_umurFragment, bund)
        }

        fab_profile.setOnClickListener {
            val bundleNama = Bundle()
            bundleNama.putString("username", dataUser)
            bundleNama.putString("nama", dataNama)
            bundleNama.putString("pass", dataPass)
            Navigation.findNavController(view)
                .navigate(R.id.action_homeFragment_to_profilFragment, bundleNama)
        }
    }
}