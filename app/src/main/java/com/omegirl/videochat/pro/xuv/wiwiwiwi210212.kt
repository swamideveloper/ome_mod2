package com.omegirl.videochat.pro.xuv

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.omegirl.videochat.pro.R
import com.omegirl.videochat.pro.xuv.wiwiwiwi210212.ButtonsViewHolder

class wiwiwiwi210212 : RecyclerView.Adapter<ButtonsViewHolder>() {
    var mList = ArrayList<dmofjdifjd98789>()
    private var onItemClickListener: ItemClickListener? = null

    interface ItemClickListener {
        fun onItemClick(view: View?, i: Int)
    }

    fun setData(arrayList: ArrayList<dmofjdifjd98789>) {
        mList = arrayList
        notifyDataSetChanged()
    }

    fun setItemClickListener(itemClickListener: ItemClickListener?) {
        onItemClickListener = itemClickListener
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ButtonsViewHolder {
        return ButtonsViewHolder(
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.cyan_item_winner, viewGroup, false)
        )
    }

    override fun onBindViewHolder(buttonsViewHolder: ButtonsViewHolder, i: Int) {
        buttonsViewHolder.txt1.text = mList[i].winner_name
        buttonsViewHolder.txt2.text = mList[i].winner_amount
        buttonsViewHolder.txt3.text = mList[i].winner_title
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class ButtonsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txt1: TextView
        var txt2: TextView
        var txt3: TextView

        init {
            txt1 = view.findViewById<View>(R.id.txt1) as TextView
            txt2 = view.findViewById<View>(R.id.txt2) as TextView
            txt3 = view.findViewById<View>(R.id.txt3) as TextView
        }
    }
}