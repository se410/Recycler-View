package com.example.recyclerviewexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    //vars
    val names = ArrayList<String>()
    val imageUrls = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initImageBitmaps()
    }

    private fun initImageBitmaps() {


        imageUrls.add("https://www.jdtours.com/wp-content/uploads/2017/03/79e08f32fa8a036f84441baab7b7a7ff_L.jpg")
        names.add("Petra")
        imageUrls.add("https://d3qvqlc701gzhm.cloudfront.net/full/1c7200deb9d5a11cd68d62a9b2569e48f7c96414db2ac711f28ccede06b6f2ee.jpg")
        names.add("Aqaba")
        imageUrls.add("https://www.jdtours.com/wp-content/uploads/2019/08/60959e8d8c34f5c00b9627dfd768f462_L-e1566203047843.jpg")
        names.add("Wadi Rum")
        imageUrls.add("https://www.jdtours.com/wp-content/uploads/2017/03/um-qais-medium.jpg")
        names.add("Umm Qais")
        imageUrls.add("https://jdtours.com/wp-content/uploads/2017/03/dead-sea-big-use-1.jpg")
        names.add("Dead Sea")
        imageUrls.add("https://www.jdtours.com/wp-content/uploads/2019/08/570378-1-370x260.jpg")
        names.add("Jerash")
        imageUrls.add("https://jdtours.com/wp-content/uploads/2017/03/umm-al-jimal-medium-use.jpg")
        names.add("Umm El Jimal")
        imageUrls.add("https://jdtours.com/wp-content/uploads/2017/03/jordan.main-hot-springs-medium.jpg")
        names.add("Ma’in")
        imageUrls.add("https://www.jdtours.com/wp-content/uploads/2017/03/umm-rassas-medium-use.jpg")
        names.add("Um Rassas")
        imageUrls.add("https://www.jdtours.com/wp-content/uploads/2019/08/sh1.jpg")
        names.add("Shobak Castle")
        imageUrls.add("https://jdtours.com/wp-content/uploads/2017/03/ajlun-castle-use.jpg")
        names.add("Ajloun")
        imageUrls.add("https://jdtours.com/wp-content/uploads/2017/03/pella2.jpg")
        names.add("Pella")
        initRecyclerView()
    }

    private fun initRecyclerView() {

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val adapter = RecyclerViewAdapter(this, names, imageUrls)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
