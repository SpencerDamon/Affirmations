/**
 * Data displayed may come from different sources (eg. within your app project, or an online source.
 * As a result the data may not be the exact format you need. The rest of the app should not concern
 * itself with where it came from, or what was it's original format.
 * You should hide it away in a seperate Datasource class that prepares the data.
 */
/**
6. Create a class to be a data source
Data displayed in your app may come from different sources (e.g. within your app project or from an
external source that requires connecting to the internet to download data). As a result, data may
not be in the exact format that you need. The rest of the app should not concern itself with where
the data originates from or in what format it is originally. You can and should hide away this data
preparation in a separate Datasource class that prepares the data for the app.

Enter Datasource as the class name.
Inside the Datasource class, create a function called loadAffirmations().
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource {
    /** 7. Create a function called loadAffirmations, which needs to return a list of Affirmations.
     *     You do this by creating a list, and populating it with an Affirmation instance for each
     *     resource string.
     *     Declare List<Affirmation> as the return type
     *     Call listOf<>() to create a List
     *     Inside the angle brackets specify the type of the list items as Affirmation
     *     If necessary (Auto Import is not on in settings),
     *     import com.example.affirmations.model.Affirmation
     *     Inside the parentheses, create an Affirmation, passing in R.string.affirmation1
     *     as the resource ID.
     *     Add the remaining affirmations, separated by a comma , .
     */
    /**
     *  22. Initialize list of affirmations with images
     *  Now that you've changed the constructor of the Affirmation class, you need to update the
     *  Datasource class. Pass in an image resource ID to each Affirmation object that is
     *  initialized.
     *  You should see an error for each instantiation of Affirmation.
     *      For each Affirmation, add the resource ID of an image as an argument,
     *      such as R.drawable.image1.
     *
     *      Open res > layout > list_item.xml.
     *      GOTO list_item.xml
     */
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10)

        )
    }
}
/** OPTIONAL 8. Display the size of the Affirmations list in a TextView
    To verify that you can create a list of affirmations, you can call loadAffirmations() and display
    the size of the returned list of affirmations in the TextView that comes with your Empty Activity app template.

    GOTO layouts/activity_main.xml
 */