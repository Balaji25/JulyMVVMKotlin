package com.bg.julymvvmkotlin.viewmodel

import androidx.lifecycle.ViewModel


/**
 * Created by balaji on 26/7/20.
 */
class LoginViewModel : ViewModel(){

    val username:String?=null
    val password:String?=null


    fun validateCredentials(){

        if (username.isNullOrEmpty() || password.isNullOrEmpty()){

        }


    }
}