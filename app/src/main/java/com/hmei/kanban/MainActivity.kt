package com.hmei.kanban

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fabAdd = findViewById<FloatingActionButton>(R.id.fabAdd)

        fabAdd.setOnClickListener {
           Log.e("Add","add item")
        }

        supportActionBar?.apply {
            setTitle(R.string.app_name)
            setSubtitle(R.string.app_subtitle)

            // documentation source developer.android.com

            // Set whether to include the application home affordance in the
            // action bar. Home is presented as either an activity icon or logo.
            setDisplayShowHomeEnabled(true)


            // Set whether to display the activity logo rather than the
            // activity icon. A logo is often a wider, more detailed image.
            setDisplayUseLogoEnabled(true)


            // Set the logo to display in the 'home' section of the action bar.
            setLogo(R.mipmap.ic_launcher)
        }
    }
    // Menu handling
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.action_about -> {
                val intentAbout = Intent(this, AboutActivity::class.java)
                startActivity(intentAbout)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}