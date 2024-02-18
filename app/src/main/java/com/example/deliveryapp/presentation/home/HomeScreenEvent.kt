package com.example.deliveryapp.presentation.home

import com.example.deliveryapp.domain.model.Restaurant

sealed class HomeScreenEvent {
    data class SelectRestaurant(val restaurant: Restaurant, val onClick: () -> Unit) :
        HomeScreenEvent()
}