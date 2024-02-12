package com.example.deliveryapp.domain.repository

interface LoginRepository {
    fun readLoginState(): Boolean
    fun toggleLoginState()
}