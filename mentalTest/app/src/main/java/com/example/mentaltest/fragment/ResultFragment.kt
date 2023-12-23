package com.example.mentaltest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mentaltest.R


/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?:-1 // 만약 전체가 null이면 -1반환

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        setResult(option)

        val btnHome = view.findViewById<ImageView>(R.id.btn_home)
        btnHome.setOnClickListener{
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option: Int) {
        val tvMain = view?.findViewById<TextView>(R.id.tv_main)
        val tvSub = view?.findViewById<TextView>(R.id.tv_sub)

        when (option) {
            1 -> {
                tvMain?.text = "You are a QUITTER!"
                tvSub?.text = "You can let the person easily."
            }

            2 -> {
                tvMain?.text = "You should focus on yourself."
                tvSub?.text = "You become really clingy to your ex."
            }

            3 -> {
                tvMain?.text = "You should take it easy."
                tvSub?.text = "You can do crazy things no matter what it takes."
            }

            4 -> {
                tvMain?.text = "You are pretty mature."
                tvSub?.text = "You can easily accept the break-up."
            }
        }
    }

}