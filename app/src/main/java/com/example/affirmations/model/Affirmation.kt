package com.example.affirmations.model

// When you make it a data class, you must add at least one property.
data class Affirmation(val stringResourceId: Int) {
    /** When you create an instance of Affirmation, you need to pass in the resource ID for the
     *  affirmation string.  The resource ID is an integer. This satisfies the issues giving the
     *  error when data was added to the class keyword.
     */

}