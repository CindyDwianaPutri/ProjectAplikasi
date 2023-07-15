package com.example.project1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.content.Intent
import com.example.project1.BioActivity
import com.example.project1.R
import com.example.project1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
// binding.ly3.setOnClickListener {
        //  val intent = Intent(this@DashboardFragment.requireContext(),MainActivity::class.java)
        // startActivity(intent)
        // }

        binding.aa.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), BioActivity::class.java)
            startActivity(intent)
        }
        // binding.bike.setOnClickListener {
        // val intent = Intent(this@DashboardFragment.requireContext(), MainActivity::class.java)
        // startActivity(intent)
        //}
        //binding.mobil.setOnClickListener {
        //   val intent = Intent(this@DashboardFragment.requireContext(), KalkulatorActivity::class.java)
        //  startActivity(intent)
        // }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}