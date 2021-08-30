package com.example.contactlist.app

sealed class AppState {
    class Success(val data: List<String>) : AppState() {

    }

    object Loading : AppState() {

    }

}