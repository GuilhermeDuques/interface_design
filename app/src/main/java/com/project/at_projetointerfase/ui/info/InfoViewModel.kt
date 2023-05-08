package com.project.at_projetointerfase.ui.info

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InfoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Informações Pessoais"
    }
    val text: LiveData<String> = _text
}