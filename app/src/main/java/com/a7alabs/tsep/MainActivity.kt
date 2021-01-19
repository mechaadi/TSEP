package com.a7alabs.tsep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.reflect.Array.newInstance


class Home : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.home, container, false)


    companion object {
        fun newInstance(): Home = Home()
    }

}


class NewPost : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.newpost, container, false)


    companion object {
        fun newInstance(): NewPost = NewPost()
    }
}


class Profile : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.profile, container, false)


    companion object {
        fun newInstance(): Profile = Profile()
    }
}

class MainActivity : AppCompatActivity() {

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
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
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar?.title = "Toolbar"
        toolbar?.subtitle = "Subtitle"
        toolbar?.navigationIcon = ContextCompat.
        getDrawable(this,R.drawable.ic_launcher_background)
        setContentView(R.layout.activity_main)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.navbar)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        val homeFragment = Home.newInstance()
        openFragment(homeFragment)

    }
}