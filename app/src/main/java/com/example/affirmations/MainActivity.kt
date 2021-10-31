package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* To verify that you can create a list of affirmations,
           In activity_main, give the TextView in the template and id of textview
           In MainActivity in the onCreate() method after the existing code, get a reference to
           textview
           Then create and display the size of the Affirmations list.
           Create a datasource, call loadAffirmations(), get the size of the returned list,
           convert it into a string, and assign it as the text of textview.
           Run the app.
           The number returned should equal the number of affirmations in strings.xml

        val textView: TextView = findViewById(R.id.textview)
        textView.text = Datasource().loadAffirmations().size.toString() /* Returns 10 */
         */
    }
}