package com.example.deliveryapp.presentation.home

import com.example.deliveryapp.domain.model.Advertisement
import com.example.deliveryapp.domain.model.FoodItem
import com.example.deliveryapp.domain.model.Restaurant

data class HomeScreenState(
    val adsList: List<Advertisement> = emptyList(),
    val foodList: List<FoodItem> = emptyList(),
    val likedRestaurantList: List<Restaurant> = emptyList(),
    val restaurantList: List<Restaurant> = emptyList(),
)
