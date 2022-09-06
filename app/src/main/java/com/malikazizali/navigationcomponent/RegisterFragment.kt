package com.malikazizali.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_reg.setOnClickListener {
            val dataUsername = et_username.text.toString()
            val dataNama = et_name.text.toString()
            val dataPass = et_pass.text.toString()

            val bund = Bundle()
            bund.putString("username", dataUsername)
            bund.putString("nama", dataNama)
            bund.putString("pass", dataPass)
            Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment, bund)
        }
    }

}