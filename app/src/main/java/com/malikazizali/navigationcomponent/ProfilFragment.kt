package com.malikazizali.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_profil.*

class ProfilFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val username = arguments?.getString("username")
        val nama = arguments?.getString("nama")
        val pass = arguments?.getString("pass")

        tv_fullnameProfile.text = nama

        btn_keluar.setOnClickListener {
            val bundleProfile = Bundle()
            bundleProfile.putString("username", username)
            bundleProfile.putString("nama", nama)
            bundleProfile.putString("pass", pass)
            Navigation.findNavController(view).navigate(R.id.action_profilFragment_to_loginFragment, bundleProfile)
        }
    }
}