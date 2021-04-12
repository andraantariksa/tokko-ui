package io.github.andraantariksa.tokko

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.andraantariksa.tokko.data.model.Category
import io.github.andraantariksa.tokko.databinding.ItemCardCategoryBinding

class CategoriesAdapter(val productData: Array<Category>):
    RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCardCategoryBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = productData[position]
        holder.binding.imageViewCategory.setImageResource(category.image)
    }

    override fun getItemCount(): Int = productData.size

    class ViewHolder(val binding: ItemCardCategoryBinding): RecyclerView.ViewHolder(binding.root)
}