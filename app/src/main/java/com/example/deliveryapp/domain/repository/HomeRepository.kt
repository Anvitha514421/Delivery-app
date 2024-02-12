package com.example.deliveryapp.domain.repository

import com.example.deliveryapp.data.repository.Results
import com.example.deliveryapp.domain.model.Advertisement
import com.example.deliveryapp.domain.model.FoodItem
import com.example.deliveryapp.domain.model.Restaurant

interface HomeRepository {

    suspend fun getRestaurants(): Results<List<Restaurant>>
    suspend fun getAds(): Results<List<Advertisement>>
    suspend fun getFoodItems(): Results<List<FoodItem>>
    fun getRestaurantFromName(name: String): Restaurant?

}