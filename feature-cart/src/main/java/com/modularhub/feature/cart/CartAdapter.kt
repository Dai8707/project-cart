package com.modularhub.feature.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.modularhub.feature.cart.databinding.ItemCartBinding

class CartAdapter(private val items: List<CartItem>) :
    RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemCartBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCartBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.binding.tvName.text = item.name
        holder.binding.tvDetail.text = "¥${item.price} × ${item.quantity}"
        holder.binding.tvSubtotal.text = "小计 ¥${item.subtotal}"
    }

    override fun getItemCount(): Int = items.size
}
