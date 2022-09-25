package com.utn.glideexample.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.utn.glideexample.R

class mainFragment : Fragment() {

    lateinit var v : View
    lateinit var imgAvatar : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_main, container, false)

        //Code below here
        imgAvatar = v.findViewById(R.id.imgAvatar)
        ////
        return v
    }

    override fun onStart() {
        super.onStart()

        var url = "https://guitarrasramirez.com/wp-content/uploads/2020/11/guitarra-aniversario.png"

        Glide.with(v)
            .load(url)
            .into(imgAvatar)
    }

}