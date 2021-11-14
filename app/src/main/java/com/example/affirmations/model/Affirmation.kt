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
 *  21.
 *      Modify the constructor of the Affirmation class by adding another Int parameter named
 *      imageResourceId.
 *  Using resource annotations
 *  Both stringResourceId and imageResourceId are integer values. Although this looks okay, the
 *  caller could accidentally pass in the arguments in the wrong order (imageResourceId first
 *  instead of stringResourceId).
 *  To avoid this, you can use Resource annotations. Annotations are useful because they add
 *  additional info to classes, methods, or parameters. Annotations are always declared with an
 *  @ symbol. In this case, add the @StringRes annotation to your string resource ID property and
 *  @DrawableRes annotation to your drawable resource ID property. Then you will get a warning if
 *  you supply the wrong type of resource ID.
 *      Add the @StringRes annotation to stringResourceId.
 *      Add the @DrawableRes annotation to imageResourceId.
 *      Make sure the imports androidx.annotation.DrawableRes and androidx.annotation.StringRes are
 *      added at the top of your file after the package declaration.
 *
 *  Initialize list of affirmations with images
 *  Now that you've changed the constructor of the Affirmation class, you need to update the
 *  Datasource class.
 *  Pass in an image resource ID to each Affirmation object that is initialized.
 *      Open Datasource.kt.
 *  GOTO Datsource.kt
 */

/**
 * [Affirmation] is the data class to represent the Affirmation text and imageResourceId
 */
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {


}