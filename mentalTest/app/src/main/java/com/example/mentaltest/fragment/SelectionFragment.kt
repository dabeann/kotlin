package com.example.mentaltest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mentaltest.R


/**
 * A simple [Fragment] subclass.
 * Use the [SelectionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SelectionFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        val btnBack = view.findViewById<ImageView>(R.id.btn_back)
        btnBack.setOnClickListener(this)

        val op1 = view.findViewById<TextView>(R.id.option_1)
        op1.setOnClickListener(this)

        val op2 = view.findViewById<TextView>(R.id.option_2)
        op2.setOnClickListener(this)

        val op3 = view.findViewById<TextView>(R.id.option_3)
        op3.setOnClickListener(this)

        val op4 = view.findViewById<TextView>(R.id.option_4)
        op4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option_1 -> {navigateWithIndex(1)}
            R.id.option_2 -> {navigateWithIndex(2)}
            R.id.option_3 -> {navigateWithIndex(3)}
            R.id.option_4 -> {navigateWithIndex(4)}
            R.id.btn_back -> {
                navController.popBackStack()
            }
        }
    }

    fun navigateWithIndex(index: Int) {
        val bundle = bundleOf("index" to index)

        navController.navigate(R.id.action_selectionFragment_to_resultFragment, bundle)
    }
}