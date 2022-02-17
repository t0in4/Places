package com.eyehail.places.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.eyehail.places.R

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController  // se crea la variable de tipo NavControler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*navController = Navigation.findNavController(this,R.id.fragmentContainerView)  //Se Asigna al NavControler el fragmenID contenida en el main activity
        NavigationUI.setupActionBarWithNavController(this, navController)  // Se crea el Navigation UpBack Button en el NavigationBAR*/

    }
    /*override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController,null)
    }*/
}
