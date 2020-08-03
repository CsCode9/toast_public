package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

/**
 *@Date 2020/8/3
 *@author Chen
 *@Description
 */
class ToastUtil {

    companion object{
        fun toast(context: Context, text:String){
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
        }
    }


}