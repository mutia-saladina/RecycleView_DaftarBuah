package com.example.recyclye_daftarbuah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class BuahAdapter (
    private  val daftarBuah: List<String>
): RecyclerView.Adapter<BuahAdapter.BuahViewHolder>() {
    class BuahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNamaBuah: TextView = itemView.findViewById(R.id.tvNamaBuah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_buah, parent, false)
        return BuahViewHolder(view)
    }

    override fun onBindViewHolder(holder: BuahViewHolder, position: Int) {
        val buah = daftarBuah[position]
        holder.tvNamaBuah.text = buah

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Anda Memilih: $buah", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = daftarBuah.size
}

