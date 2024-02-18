package com.example.deliveryapp.presentation.login

sealed class UiEvent {
    data class ShowSnackbar(val message: String) : UiEvent()
}