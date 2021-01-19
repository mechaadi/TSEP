package com.a7alabs.tsep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.a7alabs.tsep.databinding.ActivityMainBinding
import com.a7alabs.tsep.fragments.Home
import com.a7alabs.tsep.fragments.NewPost
import com.a7alabs.tsep.fragments.Profile
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


    private val a = { i: Int, s: String -> i.toString() + s }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem : MenuItem ->
        when (menuItem.itemId) {
            R.id.feed -> {
                val homeFragment = Home.newInstance()
                openFragment(homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.newPost -> {
                val newPostFragment = NewPost.newInstance()
                openFragment(newPostFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.profile -> {
                val profileFragment = Profile.newInstance()
                openFragment(profileFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)

        println("-=================================================================================")
        println(a(3, "Aditya"))

        val bottomNavigation: BottomNavigationView = binding.navbar
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        val homeFragment = Home.newInstance()
        openFragment(homeFragment)

    }
}