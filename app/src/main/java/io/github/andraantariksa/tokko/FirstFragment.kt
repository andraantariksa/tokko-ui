package io.github.andraantariksa.tokko

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.flexbox.FlexboxLayoutManager
import io.github.andraantariksa.tokko.data.model.Product
import io.github.andraantariksa.tokko.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root

        val dummy = arrayOf(
            Product("Hoodie KW", 80f),
            Product("Shoes Flexible", 120f),
            Product("Shoes Flexible", 120f),
            Product("Shoes Flexible", 120f))

        binding.recyclerViewTopSelling.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewTopSelling.adapter = ProductsAdapter(dummy)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}