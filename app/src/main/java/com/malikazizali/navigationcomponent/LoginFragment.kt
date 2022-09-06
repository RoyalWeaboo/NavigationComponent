package com.malikazizali.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener {
            val username = et_username.text.toString()
            val pass = et_pass.text.toString()

            val usernameUser = arguments?.getString("username")
            val namaUser = arguments?.getString("nama")
            val passUser = arguments?.getString("pass")

            val bund = Bundle()
            bund.putString("username", username)
            bund.putString("pass", pass)
            bund.putString("nama", namaUser)

            if (username == usernameUser && passUser == pass) {
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment, bund)
            }else{
                Toast.makeText(context, "Username atau Password Salah", Toast.LENGTH_LONG).show()
            }
        }
        tv_reg.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }
        tv_lupapass.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_lupaPassFragment)
        }
        fab_cs.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_chatCSFragment)
        }
        fab_help.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_helpFragment)
        }
    }

}