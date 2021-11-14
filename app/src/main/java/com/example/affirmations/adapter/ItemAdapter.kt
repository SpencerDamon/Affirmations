package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/*
   13. Overview: IMPLEMENT THE ADAPTER
   - Create a new class for the adapter, for example ItemAdapter
   - Create a custom ViewHolder class that represents a single list item view. Extend
     from RecyclerView.ViewHolder class.
   - Modify the ItemAdapter class to extend from the RecyclerView.Adapter class with the
     custom ViewHolder class.
   - Implement these methods within the adapter: getItemsCount(), onCreateViewHolder(),
     and onBindViewHolder().

   CREATE AN ItemAdapter CLASS
   Add a parameter to the constructor of ItemAdapter, so you can pass the list of affirmations
   to the adapter.

       Add a parameter to the ItemAdapter constructor that is a val called dataset of type
       List<Affirmation>. Import Affirmation, if necessary,
       import com.example.affirmations.model.Affirmation  .
       dataset will only be used in this class so make it private.

   The ItemAdapter needs information on how to resolve string resources. This and other information
   is stored in a Context object instance that you can pass into an ItemAdapter instance.
       Add a parameter to the ItemAdapter constructor that is a val called context of type Context.
       Position it as the first parameter in the constructor.
   GOTO class ItemAdapter

   15. OVERRIDE ADAPTER METHODS
   Add the code to extend your ItemAdapter from the abstract class RecyclerView.Adapter. Specify
   ItemAdapter.ItemViewHolder as the view holder type in angle brackets. An error is created because
   you need to implement some abstract methods from RecyclerViewAdapter.
   Put your cursor on ItemAdapter (underlined in red) and press control + i. This shows you the
   list of methods you need to implement: getItemCount(),onCreateViewHolder(),
   and onBindViewHolder(). Select all three functions using Shift+click, and click OK. This creates
   stubs with the correct parameters for the three methods after the ItemViewHolder class.
   Error is gone.  Now implement those methods. See 4.
*/
/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    /* 14. CREATE A ViewHolder
       RecyclerView doesn't interact directly with item views, but deals with ViewHolders instead
       A ViewHolder represents a single list item view in RecyclerView, and can be reused when
       possible.  A ViewHolder instance holds references to the individual views within a list
       item layout. This makes it easier to update the list item view with new data. View holders
       also add information that RecyclerView uses efficiently move views around the screen.
       Inside the ItemAdapter class, before the closing curly brace for ItemAdapter, create an
       ItemViewHolder class.
       A class inside a class is called a nested class. Since ItemViewHolder is only used by
       ItemAdapter, creating it inside ItemAdapter shows this relationship. This is not mandatory,
       but helpful to other developers to understand your program.

       Add a private value view of type View as a parameter to the ItemViewHolder class constructor.
       Make ItemViewHolder a subclass of RecyclerView. ViewHolder and pass the view parameter into
       the superclass constructor.
       Inside ItemViewHolder, define a val property textView that is of type TextView.
       Assign the view with the ID item_title that you defined in list_item.xml
     */

    /*
       Update the itemAdapter to set the image.
         Add a reference to ImageView in ItemViewHolder:
           Below the initialization of the TeztView property add a val called imageView.
           Use findViewById to find the reference to ImageView with id item_image and,
           assign it to the imageView property.
           now go to the bindOnView function below.
     */

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and you provide access to
    // all the views for the data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)

    }

    /* 17. IMPLEMENT onCreateViewHolder()
       The onCreateViewHolder() method is called by the layout manager to create new view holders
       for the RecyclerView (when there is no existing view holders that can be reused).
       Remember that a view holder represents a single list item view.
       The onCreateViewHolder() method takes two parameters and returns a new viewHolder
       * parent parameter - which is the view group that the new list item view will be attached to
         as a child.  Te parent is the RecyclerView.
       * viewType parameter, which becomes important when there are multiple item view types in the
         same RecyclerView. If you have different list item layouts displayed within the
         RecyclerView, there are different item view types. You can only recycle views with the same
         item view types. In this case, there is only one list item layout and one item view type,
         so there is no need to worry about this parameter in this app.
       In the onCreateViewHolder() method, obtain an instance of LayoutInflater from the provided
       context (context of the parent). The layout inflater knows how to inflate an xml layout into
       a hierarchy of view objects.
       Once you have a LayoutInflater object instance, add a dot followed by another method call to
       inflate the actual list item view.
       Pass in the xml layout resource ID R.layout.list_item and the parent view group.
       The third boolean argument is attachToRoot.  This argument needs to be false, because the
       RecyclerView adds this item to the view hierarchy for you when it's time.
       Now adapterLayout can hold a reference to the list item view (from which we can later find
       child views like the TextView).
       In onCreateViewHolder(), return a new ItemViewHolder instance where the root view is
       adapterLayout.
     */
    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }
    /* 18. IMPLEMENT onBindViewHolder()
          This method is called on by the layout manager in order to replace the contents of a list
          item view.
          It has two parameters, an ItemViewHolder previously created by onCreateViewHolder() method
          and an Int that represents the current item position in the list.
          In this method, find the right Affirmation object from the data set based on position.
          * Inside onBindViewHolder(), create a val item and get the item at the given position in
            the data set.
          Update all the views referenced by the view holder to reflect the correct data for this
          item. In this case there is only one view: the TextView within ItemViewHolder.
          Set the text of the TextView to display the Affirmation string for this item.
          * With an Affirmation object instance you can find the corresponding string resource ID
            by calling item.stringResourceId . However , this is an integer and you need to find the
            mapping to the actual string value.
            That means you can call context.resources.getString() and pass in a string resource ID.
            The resulting string can be set as the text of the textView in the holder ItemViewHolder
            In short, this line of code updates the view to show the affirmation string.
                holder.textView.text = context.resources.getString(item.stringResourceId)
            Adapter code is finished
            Now that you've implemented the ItemAdapter, you need to tell the RecyclerView to use
            this adapter.
            Modify the MainActivity to use a RecyclerView
            To finish, you need to use your Datasource and ItemAdapter classes to create and display
            items in the RecyclerView. You do this in MainActivity.
                Open MainActivity.kt.
            GOTO MainActivity.kt

    */
    /*
        Finish updating the itemAdapter to set the image:
            Set the affirmations item's imageResourceId onto the ViewImage of the list item view.
            Now run the app and scroll through the list of affirmations.
            The affirmations now display under the images.
     */

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    /* 16. IMPLEMENT getItemCount()
       The getItemCount() method needs to return the size of your dataset. Your app's data is in the
       dataset property that you are passing into the ItemAdapter constructor, and you can get its
       size with size.
       Replace getItemCount() with: override fun getItemCount() = dataset.size
       Which is more concise than: override fun getItemCount(): Int {return dataset.size}
     */
    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size
    /* Now go to MainActivity, and modify  to use the recycler view.*/
}