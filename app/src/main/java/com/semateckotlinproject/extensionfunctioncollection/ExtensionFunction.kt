package com.semateckotlinproject.extensionfunctioncollection

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

fun Button.activeButton() {
    isEnabled = true
}

fun Button.deactiveButton() {
    isEnabled = false
}

fun ImageView.getImageFromUrl(url: String) {
    Picasso.get().load(url).into(this)
}

//@Suppress("DEPRECATION")
//@SuppressLint("MissingPermission")
//fun iisConnected(context: Context): Boolean {
//
//    val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//    val netinfo = cm.activeNetworkInfo
//
//    if (netinfo != null && netinfo.isConnectedOrConnecting) {
//        val wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
//        val mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE)
//
//        return mobile != null && mobile.isConnectedOrConnecting || wifi != null && wifi.isConnectedOrConnecting
//    } else
//        return false
//}
//
//fun Context.isConnected(context: Context):Boolean{
//    val connectivityManager
//}

fun Context.isInternetConnectionAvailable(): Boolean{
    val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetworkInfo = connectivityManager.activeNetworkInfo
    return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting
}