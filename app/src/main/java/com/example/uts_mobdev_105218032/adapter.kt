package com.example.uts_mobdev_105218032

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.util.Log

class adapter: RecyclerView.Adapter<adapter.ViewHolder>() {
    // daftar title yang akan ditampilkan di card
    private val titles = arrayOf("Hotel 1")
    // daftar teks yang akan ditampilkan juga
    private val details = arrayOf("jalan dharmawangsa no.6")
    // Daftar gambar yang sudah disimpan di folder drawable
    private val images = intArrayOf(R.drawable.hotel1)





        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

            var itemImage: ImageView
            var itemTitle: TextView
            var itemDetail: TextView

            init {
                itemImage = itemView.findViewById(R.id.item_image)
                itemTitle = itemView.findViewById(R.id.item_title)
                itemDetail = itemView.findViewById(R.id.item_detail)
            }
        }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
        Log.e("TAG", titles[i]);
    }
    override fun getItemCount(): Int {
        return titles.size
    }
    }





