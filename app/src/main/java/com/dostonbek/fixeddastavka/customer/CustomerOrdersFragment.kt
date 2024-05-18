package com.dostonbek.fixeddastavka.customer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dostonbek.fixeddastavka.databinding.FragmentCustomerOrdersBinding


class CustomerOrdersFragment : Fragment() {
    private lateinit var binding: FragmentCustomerOrdersBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentCustomerOrdersBinding.inflate(layoutInflater)
        return binding.root
    }


}

