package io.github.andraantariksa.tokko.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.andraantariksa.tokko.databinding.FragmentMainAccountBinding

class AccountFragment : Fragment() {
    private lateinit var binding: FragmentMainAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainAccountBinding.inflate(inflater, container, false)
        return binding.root
    }
}