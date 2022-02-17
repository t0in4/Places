package com.eyehail.places.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.ActivityChooserView
import androidx.fragment.app.ListFragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.eyehail.places.R
import com.eyehail.places.databinding.FragmentDetailBinding

import com.eyehail.places.databinding.FragmentDetailBinding.inflate
import com.eyehail.places.databinding.FragmentListBinding
import com.eyehail.places.databinding.FragmentListBindingImpl
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val binding = FragmentDetailBinding.bind(view)


        view.findViewById<FloatingActionButton>(R.id.buttonDetails).setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.actionDetailFragment)
        }


    }


}