package com.admin.adminpannel.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.admin.adminpannel.R
import com.admin.adminpannel.databinding.FragmentProductBinding
import com.admin.adminpannel.databinding.FragmentSliderBinding


class ProductFragment : Fragment() {
    private lateinit var binding: FragmentProductBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductBinding.inflate(layoutInflater)
        // Moving to Add Product Activity

        binding.floatingActionButton2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_productFragment_to_addProductFragment)
        }
        return binding.root
    }
}