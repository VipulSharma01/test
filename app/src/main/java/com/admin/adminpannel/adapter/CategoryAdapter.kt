package com.admin.adminpannel.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.admin.adminpannel.R
import com.admin.adminpannel.databinding.ItemCategoryBinding
import com.admin.adminpannel.model.CategoryModel
import com.bumptech.glide.Glide

class CategoryAdapter(var context : Context, private val list :ArrayList<CategoryModel>) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    inner class  CategoryViewHolder(view: View) :RecyclerView.ViewHolder(view) {

            var binding  = ItemCategoryBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return  CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_category,parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.textView2.text = list[position].cate
        Glide.with(context).load(list[position].img).into(holder.binding.imageView2)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}