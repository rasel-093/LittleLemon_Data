package com.example.littlelemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    // add code here
    @SerialName("menu")
    val menu: List<MenuItemNetwork>
)

@Serializable
data class MenuItemNetwork(
    // add code here
    @SerialName("id")
    val id: Int,
    @SerialName("price")
    val price: Double,
    @SerialName("title")
    val title: String
) {
    fun toMenuItemRoom() = MenuItemRoom(
        // add code here
        id = id,
        price = price,
        title = title
    )
}
