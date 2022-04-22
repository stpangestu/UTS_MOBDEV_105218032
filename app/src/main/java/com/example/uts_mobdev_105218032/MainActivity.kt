package com.example.uts_mobdev_105218032

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager



class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<adapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(toolbar)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        adapter = adapter()
        recyclerView.adapter = adapter

    }
}