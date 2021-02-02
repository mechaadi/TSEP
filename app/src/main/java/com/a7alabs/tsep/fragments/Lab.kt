package com.a7alabs.tsep.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.a7alabs.tsep.databinding.LabBinding
import com.a7alabs.tsep.experiments.Three
import com.a7alabs.tsep.experiments.Two
import kotlinx.android.synthetic.main.lab.view.*


class Lab : Fragment() {

    private  lateinit  var binding: LabBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = LabBinding.inflate(inflater)
        val view = binding.root
        println(view)
        view.labOne.setOnClickListener {
            println("Image Button Clicked")
        }
        view.labTwo.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Two::class.java))
                // finish()
            }
        }
        view.labThree.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Three::class.java))
               // finish()
            }
        }
        return view
    }

    companion object {
        fun newInstance(): Lab = Lab()
    }

}