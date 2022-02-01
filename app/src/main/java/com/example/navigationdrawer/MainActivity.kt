package com.example.navigationdrawer

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.navigationdrawer.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate       (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
/***********************************/

        setSupportActionBar(binding.toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

/***********************************************************/

val sectionAdapter:ManageViewPagerAdapter = ManageViewPagerAdapter(supportFragmentManager)
       binding.MainTab.setTabTextColors(Color.DKGRAY, Color.DKGRAY)
       binding.MainTab.setSelectedTabIndicatorColor(Color.BLACK)
       binding.viepager.adapter=sectionAdapter
       binding.MainTab.setupWithViewPager(binding.viepager)
 /*******************************************************************/
        binding.toggleButton.setOnClickListener {

            binding.drawerlayout.openDrawer(GravityCompat.START)
        }

         binding.navView.setNavigationItemSelectedListener {
                 menuItem ->
             // set item as selected to persist highlight
             menuItem.isChecked = true
              // close drawer when item is tapped
              binding.drawerlayout.closeDrawers()

             when (menuItem.itemId) {

                 R.id.nav_profile -> {
                     Toast.makeText(this, "Profile", Toast.LENGTH_LONG).show()
                 }
                 R.id.nav_wallet -> {
                     Toast.makeText(this, "Wallet", Toast.LENGTH_LONG).show()
                 }
                 R.id.nav_offer -> {
                     Toast.makeText(this, "Offer", Toast.LENGTH_LONG).show()
                 }
                 R.id.nav_setting -> {
                     Toast.makeText(this, "Setting", Toast.LENGTH_LONG).show()
                 }
             }
             // Add code here to update the UI based on the item selected
             // For example, swap UI fragments here

             true
         }
         }
}