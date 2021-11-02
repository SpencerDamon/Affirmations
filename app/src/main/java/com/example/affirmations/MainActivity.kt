package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

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
        /* 7. After creating the Recycler View in ItemAdapter, you need to tell RecyclerView to use
           adapter. You need to use your Datasource and ItemAdapter classes to create and display
           items in the RecyclerView.
           * In the onCreate() method, under setContentView(R.layout.activity_main), create an
             instance of Datasource, and call the loadAffirmations() method on it. Store the
             returned list of affirmations in a val named myDataset.
           * Create a variable called recyclerView and use findViewById() to find a reference to the
             RecyclerView within the layout.
           * To tell the recyclerView to use the ItemAdapter class you created,
             create a new ItemAdapter instance. ItemAdapter expects two parameters:
             the context literally (this) of this activity, and the affirmations in myDataset.
             Assign the ItemAdapter object to the adapter property of the recyclerView
           * Since the layout size of your RecyclerView s fixed in teh activity layout, you can set
             the setHasFixedSize parameter of the RecyclerView to True. This setting is only to
             improve performance. Use this setting if you know that changes in content do not change
             the layout size of the RecyclerView.
         */

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change this layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}