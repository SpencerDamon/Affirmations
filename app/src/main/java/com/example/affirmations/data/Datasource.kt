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
