package com.example.recyclye_daftarbuah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rcv)
        val daftarBuah = listOf(
            "Apel", "Pisang", "Jeruk", "Mangga", "Anggur",
            "Semangka", "Melon", "Pepaya", "Jambu", "Nanas",
            "Durian", "Rambutan", "Manggis", "Salak", "Markisa"
        )

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = BuahAdapter(daftarBuah)
        recyclerView.adapter = adapter

    }
}