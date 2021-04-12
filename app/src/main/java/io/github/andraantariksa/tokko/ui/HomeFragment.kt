package io.github.andraantariksa.tokko.ui

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.andraantariksa.tokko.CategoriesAdapter
import io.github.andraantariksa.tokko.ProductsAdapter
import io.github.andraantariksa.tokko.R
import io.github.andraantariksa.tokko.data.model.Category
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

        setupCategories()
        setupProducts()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setupCategories() {
        val dummy = arrayOf(
            Category(R.drawable.shoes_nike_black),
            Category(R.drawable.yellow_shirt),
            Category(R.drawable.hoodie_gray_big),
            Category(R.drawable.hoodie_pink),
        )
        val spacingInPixels = (Resources.getSystem().displayMetrics.density * 8).toInt()
        binding.includeContentMain.recyclerViewCategories.addItemDecoration(
            LinearSpacingItemDecoration(spacingInPixels)
        )
        binding.includeContentMain.recyclerViewCategories.adapter = CategoriesAdapter(dummy)
    }

    private fun setupProducts() {
        val dummy = arrayOf(
            Product("Hoodie KW", 80f),
            Product("Shoes Flexible", 120f),
            Product("Shoes Flexible", 120f),
            Product("Shoes Flexible", 120f)
        )
        val spacingInPixels = (Resources.getSystem().displayMetrics.density * 15).toInt()
        binding.includeContentMain.recyclerViewTopSelling.addItemDecoration(
            GridSpacingItemDecoration(
                2,
                spacingInPixels,
                false,
                0
            )
        )
        binding.includeContentMain.recyclerViewTopSelling.adapter = ProductsAdapter(dummy)
    }
}