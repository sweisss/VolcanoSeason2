package com.example.volcanoseason2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var urls = arrayOf<String>(
        "https://www.mountain-forecast.com/peaks/Mount-Adams/forecasts/3741",
        "https://www.mountain-forecast.com/peaks/Mount-Bachelor/forecasts/2764",
        "https://www.mountain-forecast.com/peaks/Broken-Top/forecasts/2797",
        "https://www.mountain-forecast.com/peaks/Diamond-Peak-Oregon/forecasts/2665",
        "https://www.mountain-forecast.com/peaks/Mount-Hood/forecasts/3426",
        "https://www.mountain-forecast.com/peaks/Lassen-Peak/forecasts/3187",
        "https://www.mountain-forecast.com/peaks/Mount-McLoughlin/forecasts/2894",
        "https://www.mountain-forecast.com/peaks/Mount-Shasta/forecasts/4317",
        "https://www.mountain-forecast.com/peaks/Mount-Saint-Helens/forecasts/2549",
        "https://www.mountain-forecast.com/peaks/Mount-Thielsen/forecasts/2797",
        "https://www.mountain-forecast.com/peaks/Three-Sisters/forecasts/3157",
        "https://www.mountain-forecast.com/peaks/Mount-Washington-3/forecasts/2376",
        "https://forecast.weather.gov/MapClick.php?lat=44.06&lon=-121.3#.YsZ5b-zMLeo",
        "https://forecast.weather.gov/"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView: ListView = findViewById<ListView>(R.id.listview)
        var names = ArrayList<String>()
        names.add("\uD83C\uDF0B Mt Adams")
        names.add("\uD83C\uDF0B Mount Bachelor")
        names.add("\uD83C\uDF0B Broken Top")
        names.add("\uD83C\uDF0B Diamond Peak")
        names.add("\uD83C\uDF0B Mt Hood")
        names.add("\uD83C\uDF0B Lassen Peak")
        names.add("\uD83C\uDF0B Mount McLoughlin")
        names.add("\uD83C\uDF0B Mt Shasta")
        names.add("\uD83C\uDF0B Mt St Helens")
        names.add("\uD83C\uDF0B Mt Thielsen")
        names.add("\uD83C\uDF0B Three Sisters")
        names.add("\uD83C\uDF0B Mt Washington")
        names.add("\uD83C\uDF24️  Bend NOAA")
        names.add("✔️ Equipment Checklist")


        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener{ parent, view, position, id ->
//            val myItem = parent.getItemAtPosition(position)       // For Toast debugging.
//            Toast.makeText(this, myItem.toString() + " " + position, Toast.LENGTH_SHORT).show() // Toast for debugging.
            if (position != names.size-1) {     // the last item in the array should be the equipment checklist.
               val url = urls[position]
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse(url))
                startActivity(intent)
            }
            else{
                val intent = Intent(this, EquipmentChecklistActivity::class.java).apply{}
                startActivity(intent)
            }
        }
//        fun onItemClick(adapterView: AdapterView, view: View, int: Int, long: Long){
//            Toast.makeText(MainActivity.this, "Clicked item " + int + " " + arraylist.get(int), Toast.LENGTH_SHORT).show()
//        }
    }
}