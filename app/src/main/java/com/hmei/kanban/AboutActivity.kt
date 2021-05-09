package com.hmei.kanban

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity


class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.apply {
            setTitle(R.string.action_about)
            setSubtitle(R.string.app_name)

            // documentation source developer.android.com

            // Set whether to include the application home affordance in the
            // action bar. Home is presented as either an activity icon or logo.
            setDisplayShowHomeEnabled(true)


            // Set whether to display the activity logo rather than the
            // activity icon. A logo is often a wider, more detailed image.
            setDisplayUseLogoEnabled(true)


            // Set the logo to display in the 'home' section of the action bar.
            setLogo(R.mipmap.ic_launcher_kanban)

            setDisplayHomeAsUpEnabled(true)
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                super.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}