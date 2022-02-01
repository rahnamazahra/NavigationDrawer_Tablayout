package com.example.navigationdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigationdrawer.databinding.FragmentUsersBinding




class Usersfragment: Fragment() {

    private var _binding: FragmentUsersBinding? = null

    private val binding get() = _binding!!

    /***************************************************/
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {

        _binding = FragmentUsersBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }
    /**************************************************/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
    /**************************************************/
}
