/**
 * Data displayed may come from different sources (eg. within your app project, or an online source.
 * As a result the data may not be the exact format you need. The rest of the app should not concern
 * itself with where it came from, or what was it's original format.
 * You should hide it away in a seperate Datasource class that prepares the data.
 */
/**
 * Since preparing data is a separate concern in regards to the app functionality, we can hide it
 * away in a separate data source class in a separate data package.
 * Create a package in the package that holds MainActivity, name it data
 *  Append the parent package name with .data
 *  In the new package create a class called Datasource, this creates a Datasource.kt file
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    /** Create a function called loadAffirmations, which needs to return a list of Affirmations.
     *  You do this by creating a list, and populating it with an Affirmation instance for each
     *  resource string.
     *  Declare List<Affirmation> as the return type
     *  Call listOf<>() to create a List
     *  Inside the angle brackets specify the type of the list items as Affirmation
     *  If necessary (Auto Import is not on in settings),
     *  import com.example.affirmations.model.Affirmation
     *  Inside the parentheses, create an Affirmation, passing in R.string.affirmation1
     *  as the resource ID.
     *  Add the remaining affirmations, separated by a comma , .
     */
    fun loadAffirmations(): List<Affirmation>{
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)

        )
    }
}