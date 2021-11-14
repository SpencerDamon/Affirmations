package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// When you make it a data class, you must add at least one property.

/**
 * [Affirmation] is the data class to represent the Affirmation text and imageResourceId
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {
    /** When you create an instance of Affirmation, you need to pass in the resource ID for the
     *  affirmation string.  The resource ID is an integer. This satisfies the issues giving the
     *  error when data was added to the class keyword.
     */

}