package com.example.contactlist.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.contactlist.app.AppState
import com.example.contactlist.repository.RepositoryContact
import com.example.contactlist.repository.RepositoryContactImpl

class MainViewModel(private val repository: RepositoryContact = RepositoryContactImpl()) :
    ViewModel() {
    val contact: MutableLiveData<AppState> = MutableLiveData()

    fun getContacts() {
        contact.value = AppState.Loading
        val answer = repository.getListOfContact()
        contact.value = AppState.Success(answer)
    }
}