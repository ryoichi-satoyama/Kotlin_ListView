package com.example.kotlin_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = mutableListOf<String>()
        for(i in 0..20) {
            list.add("message: $i")
        }

        val adapter = MessageListAdapter(this)
        adapter.setList(list)
        listView.adapter = adapter
    }
}