package com.example.viewbinding

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbinding.databinding.RecyclerviewItemBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(val itemBinding: RecyclerviewItemBinding)
        :RecyclerView.ViewHolder(itemBinding.root){
            fun bindItem(task:Task){
                itemBinding.titleTv.text = task.title
                itemBinding.timeTv.text = task.timestamp
            }
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}