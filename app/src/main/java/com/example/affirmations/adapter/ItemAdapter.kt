package com.example.affirmations.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/*
   1. CREATE AN ItemAdapter CLASS
   Add a parameter to te constructor of ItemAdapter, so you can pass the list of affirmations
   to the adapter.

   Add a parameter to the ItemAdapter constructor that is a val called dataset of type
   List<Affirmation>. Import Affirmation, if necessary.

   dataset will only be used in this class so make it private.

   The ItemAdapter needs information on how to resolve string resources. This and other information
   is stored in a Context object instance that you can pass into an ItemAdapter instance.
   Add a parameter to the ItemAdapter constructor that is a val called context of type Context.
   Position it as the first parameter in the constructor.

   3. OVERRIDE ADAPTER METHODS
   Add the code to extend your ItemAdapter from the abstract class RecyclerView.Adapter. Specify
   ItemAdapter.ItemViewHolder as the view holder type in angle brackets. An error is created because
   you need to implement some abstract methods from RecyclerViewAdapter.
   Put your cursor on ItemAdapter (underlined in red) and press control + i. This shows you the
   list of methods you need to implement: getItemCount(),onCreateViewHolder(),
   and onBindViewHolder(). Select all three functions using Shift+click, and click OK. This creates
   stubs with the correct parameters for the three methods after the ItemViewHolder class.
   Error is gone.  Now implement those methods. See 4.
*/
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    /* 2. CREATE A ViewHolder
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
       Make ItemViewHolder a subclass of RecyclerView.ViewHolder and pass the view parameter into
       the superclass constructor.
       Inside ItemViewHolder, define a val property textView that is of type TextView.
       Assign the view with the ID item_title that you defined in list_item.xml
     */

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /* 5. IMPLEMENT onCreateViewHolder()
       The onCreateViewHolder() method is called by the layout manager to create new view holders
       for the RecyclerView (when there is no existing view holders that can be reused).
       Remember that a view holder represents a single list item view.
       The onCreateViewHolder() method takes tewo paramters and returns a new veiwHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    /* 4. IMPLEMENT getItemCount()
       The getItemCount() method needs to return the size of your dataset. Your app's data is in the
       dataset property that you are passing into the ItemAdapter constructor, and you can get its
       size with size.
       Replace getItemCount() with: override fun getItemCount() = dataset.size
       Which is more concise than: override fun getItemCount(): Int {return dataset.size}
     */
    override fun getItemCount() = dataset.size
}