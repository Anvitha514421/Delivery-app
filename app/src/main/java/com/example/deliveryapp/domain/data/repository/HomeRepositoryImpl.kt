package com.example.deliveryapp.data.repository

import com.example.deliveryapp.data.data_source.adList
import com.example.deliveryapp.data.data_source.recommendedList
import com.example.deliveryapp.data.data_source.restaurantList
import com.example.deliveryapp.domain.model.Advertisement
import com.example.deliveryapp.domain.model.FoodItem
import com.example.deliveryapp.domain.model.Restaurant
import com.example.deliveryapp.domain.repository.HomeRepository

class HomeRepositoryImpl() : HomeRepository {

    override suspend fun getRestaurants(): Results<List<Restaurant>> {
        return Results.Success(restaurantList)
    }

    override suspend fun getAds(): Results<List<Advertisement>> {
        return Results.Success(adList)
    }

    override suspend fun getFoodItems(): Results<List<FoodItem>> {
        return Results.Success(recommendedList)
    }

    override fun getRestaurantFromName(name: String): Restaurant? {
        return restaurantList.find {
            it.name == name
        }
    }
}