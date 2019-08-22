package com.artf.chatapp.utils.extension

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.artf.chatapp.ViewModelFactory

fun Fragment.getVmFactory(): ViewModelFactory {
    return ViewModelFactory()
}

inline fun <reified T : ViewModel> Fragment.getVm(): T {
    return ViewModelProviders.of(this.activity!!, getVmFactory()).get(T::class.java)
}