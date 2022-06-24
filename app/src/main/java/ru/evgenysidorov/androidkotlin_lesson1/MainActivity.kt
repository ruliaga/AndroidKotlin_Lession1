package ru.evgenysidorov.androidkotlin_lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logMsg();

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val toast = Toast.makeText(this, "Нажми ещё", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    fun logMsg() {
        val dataClass1 = Cat("Бусик", 5, "серый")
        val dataClass2 = dataClass1.copy(color = "рыжий", name = "Мурзик")
        Log.d(
            "!!!",
            dataClass1.name + ", возраст " + dataClass1.age + " лет, окрас " + dataClass1.color
        )
        Log.d(
            "!!!",
            dataClass2.name + ", возраст " + dataClass2.age + " лет, окрас " + dataClass2.color
        )
    }

}