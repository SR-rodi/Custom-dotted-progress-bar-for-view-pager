package com.example.dottedprogressbar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dottedprogressbar.databinding.TestBinding

class TestAdapter(private val list: List<String>):RecyclerView.Adapter<TestViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = TestViewHolder(
        TestBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    )

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount()=list.size
}

class TestViewHolder(private val binding:TestBinding) :RecyclerView.ViewHolder(binding.root){

   fun bind(item:String){
       binding.text.text = item
   }
}