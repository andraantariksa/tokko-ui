package io.github.andraantariksa.tokko

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import io.github.andraantariksa.tokko.data.model.Product
import io.github.andraantariksa.tokko.databinding.ItemCardProductBinding
import io.github.andraantariksa.tokko.ui.MainFragmentDirections

class ProductsAdapter(val productData: Array<Product>):
    RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCardProductBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productData[position]
        holder.binding.textViewTitle.text = product.title
        holder.binding.textViewPrice.text = "$%.2f".format(product.price)
        holder.binding.root.setOnClickListener {
            val action = MainFragmentDirections.actionFirstFragmentToSecondFragment()
            it.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int = productData.size

    class ViewHolder(val binding: ItemCardProductBinding): RecyclerView.ViewHolder(binding.root)
}