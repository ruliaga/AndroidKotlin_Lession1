package ru.evgenysidorov.androidkotlin_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener{
            val toast=Toast.makeText(this,"Нажми ещё",Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}