package com.example.test6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        view_pager.adapter = adapter

        TabLayoutMediator(tabLayout,view_pager){tab,position->
            when(position){
                0->{
                    tab.text ="First"
                }
                1->{
                    tab.text="Second"
                }
                2->{
                    tab.text="Third"
                }
                3->{
                    tab.text="Fourth"
                }
                4->{
                    tab.text="Fiveth"
                }
            }
        }.attach()
    }
}