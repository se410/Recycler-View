package com.example.recyclerviewexample

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.layout_list_item.view.*
import java.util.*


class RecyclerViewAdapter(val context: Context , val imageNames: ArrayList<String> , val images: ArrayList<String>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){



    class MyViewHolder(val myItemView : View) : RecyclerView.ViewHolder(myItemView){

        var image: CircleImageView = myItemView.imageView
        var imageName: TextView = myItemView.textView
        var parentLayout: RelativeLayout = myItemView.parent_layout

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imageNames.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context)
            .asBitmap()
            .load(images.get(position))
            .into(holder.image)

        holder.imageName.setText(imageNames.get(position))

        holder.parentLayout.setOnClickListener {
            val intent = Intent(context, GalleryActivity::class.java)
            intent.putExtra("image_url", images.get(position))
            intent.putExtra("image_name", imageNames.get(position))
            context.startActivity(intent)
        }
    }
}