package com.example.volcanoseason2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EquipmentChecklistActivity : AppCompatActivity() {

    val header : MutableList<String> = ArrayList()
    val body : MutableList<MutableList<String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equipment_checklist)

        // populate ArrayLists here (busy work!)
    }
}