package com.a7alabs.tsep.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.a7alabs.tsep.R

class NewPost : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.newpost, container, false)


    companion object {
        fun newInstance(): NewPost = NewPost()
    }
}