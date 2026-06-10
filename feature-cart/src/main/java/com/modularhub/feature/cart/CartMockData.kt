package com.modularhub.feature.cart

data class CartItem(val id: String, val name: String, val price: Double, val quantity: Int) {
    val subtotal: Double get() = price * quantity
}

object CartMockData {
    fun items(): List<CartItem> = listOf(
        CartItem("1", "ModularHub 定制 T 恤", 99.0, 1),
        CartItem("2", "组件化架构实战手册", 68.0, 2),
        CartItem("3", "Gradle 插件开发指南", 88.0, 1),
    )

    fun total(items: List<CartItem>): Double = items.sumOf { it.subtotal }
}
