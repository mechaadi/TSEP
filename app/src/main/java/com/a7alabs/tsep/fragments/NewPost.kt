package com.a7alabs.tsep.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.a7alabs.tsep.databinding.NewpostBinding
import kotlinx.android.synthetic.main.home.view.*

class NewPost : Fragment() {
    private  lateinit  var binding: NewpostBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = NewpostBinding.inflate(inflater)
        val view = binding.root
        return view
    }

    companion object {
        fun newInstance(): NewPost = NewPost()
    }
}