package com.modularhub.feature.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.modularhub.feature.cart.databinding.FragmentCartBinding

class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val items = CartMockData.items()
        binding.tvTitle.text = "购物车"
        binding.tvSubtitle.text = "Mock 数据 · project-cart / feature-cart"
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = CartAdapter(items)
        binding.tvTotal.text = "合计：¥${CartMockData.total(items)}"
        binding.btnCheckout.text = "去结算 (${items.size})"
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
