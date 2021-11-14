package com.example.affirmations

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* OPTIONAL 8. continued from Datasource.kt
        To verify that you can create a list of affirmations,
         */
         /*
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

            Delete the above code.

            GOTO Activity_main.xml
          */

        /* 19. After creating the Recycler View in ItemAdapter, you need to tell RecyclerView to use
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
             Run your app. You should see a list of affirmation strings displayed on screen.

             Congratulations! You've just created an app that displays a list of data with
             RecyclerView and a custom adapter. Take some time to look over the code you created,
             and understand how the different pieces work together.This app has all the require
             pieces to display your affirmations, but it's not quite ready for production.
             The UI could use some improvement. Next, you'll improve your code, learn how to add
             images to the app, and polish the UI.

             20. So far you have created an adapter ItemAdapter to display affirmation strings in a
             RecyclerView. Functionally this works great, but visually it is not very appealing.
             In this task, you will modify the list item layout and adapter code to display images
             with the affirmations.
             Download the images
                 To start, open up the Affirmations app project in Android Studio.
                 If you don't have this project, go through the steps to create that project.
                 Then return here.
                 Next download the image files onto your computer. There should be ten images, one
                 for each affirmation in your app. The files should be named from image1.jpg to
                 image10.jpg.
                 Copy the images from your computer into your project's res > drawable folder
                 (app/src/main/res/drawable) within Android Studio. Once these resources have been
                 added to your app, you will be able to access these images from your code using
                 their resource IDs, such as R.drawable.image1. (You may have to rebuild your code
                 for Android Studio to find the image.)
                 Now the images are ready to use in the app.
             Add support for images in the Affirmation class
             In this step, you'll add a property in the Affirmation data class to hold a value for
             an image resource ID. That way a single Affirmation object instance will contain a
             resource ID for the text of the affirmation and a resource ID for the image of the
             affirmation.
                 Open the Affirmation.kt file within the model package.
             GOTO Affirmation.kt
         */
        /*
            To display additional content in a RecyclerView, modify the underlying data model class
            and data source. Then update the list item layout and adapter to set that data onto
            the views.
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