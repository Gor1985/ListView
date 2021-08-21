package com.example.listview

import android.content.ClipData
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding
import android.widget.Adapter as Adapter1

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        var Listt = binding.ListVieww
        var Array = mutableListOf("Красный", "Синий", "Зеленый","Оранжевый","Голубой","Черный","Фиолетовый")

        //for (i in 0..20)
        //   Array.add(""+i)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Array)
        Listt.adapter = adapter

        Listt.setOnItemClickListener(object : AdapterView.OnItemSelectedListener,// создаем слушатель для нашего листа
            AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                    Toast.makeText(this@MainActivity, "Номер "+p2 +" "+Array.get(p2), Toast.LENGTH_SHORT)
                        .show()// сравниваем позиции в списке с позициями в аррай листе
                      }


            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        })
    }
}











