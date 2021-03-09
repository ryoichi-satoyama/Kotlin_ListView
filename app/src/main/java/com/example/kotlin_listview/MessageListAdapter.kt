package com.example.kotlin_listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.list_message.view.*

class MessageListAdapter(val context: Context): BaseAdapter() {
    private var list = mutableListOf<String>()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_message, parent, false)

        view.messageTextView.text = list[position]

        view.setOnClickListener { Toast.makeText(context, "Clicked: $position", Toast.LENGTH_SHORT).show() }

        return view
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return list.size
    }

    fun setList(list: MutableList<String>) {
        this.list = list
    }
}