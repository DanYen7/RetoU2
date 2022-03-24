package com.example.retou2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.retou2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val navController=findNavController()
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.buttonHomeToInside.setOnClickListener{
            // navController.navigate(R.id.action_homeFragment_to_insideHome)
            val nombre = binding.Nombre.text.toString()
            val app = binding.ApellidoP.text.toString()
            val apm = binding.ApellidoM.text.toString()
            val nombreu=binding.Usuario.text.toString()
            val correo= binding.Email.text.toString()

            val destination = HomeFragmentDirections.actionHomeFragmentToInsideHomeFragment( nombre, app,apm,nombreu,correo)
            navController.navigate(destination)
        }
        return binding.root
    }
}