package com.example.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawer.databinding.FragmentChatsBinding


class Chatsfragment : Fragment() {

    private var _binding: FragmentChatsBinding? = null
    private val binding get() = _binding!!


    /***************************************************/
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentChatsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    /**************************************************/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
        /*************************************************/

}
