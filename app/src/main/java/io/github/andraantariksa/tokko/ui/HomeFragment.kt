package io.github.andraantariksa.tokko.ui

import android.R
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.andraantariksa.tokko.ProductsAdapter
import io.github.andraantariksa.tokko.data.model.Product
import io.github.andraantariksa.tokko.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root

        val dummy = arrayOf(
            Product("Hoodie KW", 80f),
            Product("Shoes Flexible", 120f),
            Product("Shoes Flexible", 120f),
            Product("Shoes Flexible", 120f)
        )

        val spacingInPixels = (Resources.getSystem().displayMetrics.density * 15).toInt()
        binding.recyclerViewTopSelling.addItemDecoration(
            GridSpacingItemDecoration(
                2,
                spacingInPixels,
                false,
                0
            )
        )
        binding.recyclerViewTopSelling.adapter = ProductsAdapter(dummy)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}