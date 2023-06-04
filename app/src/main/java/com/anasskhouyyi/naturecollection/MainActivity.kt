package com.anasskhouyyi.naturecollection

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.anasskhouyyi.naturecollection.fragments.HomeFragment



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //injection deu fragement dans la boite (fragement_container)

        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
