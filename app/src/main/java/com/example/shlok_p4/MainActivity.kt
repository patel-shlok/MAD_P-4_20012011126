package com.example.shlok_p4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCall = findViewById<Button>(R.id.button)
        val buttonBrowse = findViewById<Button>(R.id.button2)
        val buttonCallLog = findViewById<Button>(R.id.button3)
        val buttonPhotos = findViewById<Button>(R.id.button4)
        val buttonCamera = findViewById<Button>(R.id.button5)
        val buttonAlarm = findViewById<Button>(R.id.button6)

        buttonBrowse.setOnClickListener() {
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://uvpce.guni.ac.in")).apply {
                startActivity(this)
            }
        }

        buttonCall.setOnClickListener() {
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:7383590175")).apply {
                startActivity(this)
            }
        }

        buttonCallLog.setOnClickListener(){
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply {
                startActivity(this)
            }
        }

        buttonPhotos.setOnClickListener(){
            Intent(Intent.ACTION_VIEW).setType("image/*").apply {
                startActivity(this)
            }
        }

        buttonCamera.setOnClickListener(){
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply {
                startActivity(this)
            }
        }

        buttonAlarm.setOnClickListener(){
            Intent(AlarmClock.ACTION_SHOW_ALARMS).apply {
                startActivity(this)
            }
        }
    }
}