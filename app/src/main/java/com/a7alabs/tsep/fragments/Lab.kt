package com.a7alabs.tsep.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.a7alabs.tsep.databinding.HomeBinding
import com.a7alabs.tsep.databinding.LabBinding
import kotlinx.android.synthetic.main.home.view.*

class Lab : Fragment() {

    private  lateinit  var binding: LabBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = LabBinding.inflate(inflater)
        val view = binding.root
        return view
    }

    companion object {
        fun newInstance(): Lab = Lab()
    }

}