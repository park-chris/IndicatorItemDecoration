package com.crystal.indicatoritemdecoration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.crystal.indicatoritemdecoration.adapter.ViewPagerAdapter
import com.crystal.indicatoritemdecoration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewPager2()
    }

    private fun initViewPager2() {
        val list = listOf<String>("First", "Second", "Third", "Fourth", "Fifth")
        val adapter = ViewPagerAdapter(this, list)
        binding.viewPager2.adapter = adapter

/*        binding.viewPager2.addItemDecoration(
            com.crystal.library.ColorItemDecoration(
                this,
                8f,
                8f,
                16f,
                8f,
                ContextCompat.getColor(this, R.color.purple_500),
                ContextCompat.getColor(this, R.color.purple_200),
                8f,
                0.5f,
                0.6f
            )
        )*/
    }


}