package com.a7alabs.tsep.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.a7alabs.tsep.databinding.HomeBinding
import kotlinx.android.synthetic.main.home.view.*

class Home : Fragment() {

    private  lateinit  var binding: HomeBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = HomeBinding.inflate(inflater)
        val view = binding.root
        println(view)
        view.newNoteButton.setOnClickListener {
            // handle new note modal
            println("Image Button Clicked")
        }
        return view
    }

    companion object {
        fun newInstance(): Home = Home()
    }

}