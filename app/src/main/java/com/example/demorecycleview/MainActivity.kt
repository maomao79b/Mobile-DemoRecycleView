package com.example.demorecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var todolist = mutableListOf(
            Todo(R.drawable.a,"Flower 1",false),
            Todo(R.drawable.b,"Flower 2",true),
            Todo(R.drawable.c,"Flower 3",false),
            Todo(R.drawable.d,"Flower 4",false),
            Todo(R.drawable.e,"Flower 5",false),
            Todo(R.drawable.f,"Flower 6",false),
            Todo(R.drawable.g,"Flower 7",false),
            Todo(R.drawable.h,"Flower 8",false),
            Todo(R.drawable.i,"Flower 9",true)
        )
        val adapter = TodoAdapter(todolist)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(this)
    }
}