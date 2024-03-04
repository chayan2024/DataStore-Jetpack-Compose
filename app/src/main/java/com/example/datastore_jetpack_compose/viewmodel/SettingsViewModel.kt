package com.example.datastore_jetpack_compose.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.datastore_jetpack_compose.di.DataStoreModule
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(private val settingsDataStore: DataStoreModule) : ViewModel() {

    private val _exampleData = MutableStateFlow<String?>(null)
    val exampleData: StateFlow<String?> = _exampleData


}
