package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/** 4. Make Affirmation a data class by adding the data keyword before the class definition.
 *  This leaves you with an error, because data classes must have at least one property defined.
 *  When you create an instance of Affirmation, you need to pass in the resource ID for the
 *  affirmation string. The resource ID is an integer.
 *
 *  Add a val integer parameter stringResourceId to the constructor of the Affirmation class.
 *  This gets rid of your error.
 *
 *  5. Since preparing data is a separate concern, put the Datasource class in a separate data
 *  package.
 *  In Android Studio, in the Project window, right-click app > java > com.example.affirmations and
 *  select New > Package.
 *  Enter data as the last part of the package name.
 *  Right click on the data package and select new Kotlin File/Class.
 *
 *  GOTO Datasource.kt
*/

/**
 * [Affirmation] is the data class to represent the Affirmation text and imageResourceId
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {


}