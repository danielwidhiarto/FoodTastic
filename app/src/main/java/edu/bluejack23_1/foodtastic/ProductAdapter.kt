package com.dicodingproject.foodtastic

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ProductAdapter(private val productList: ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageProduct: ImageView = itemView.findViewById(R.id.ivProduct)
        val productTitle: TextView = itemView.findViewById(R.id.tvProductTitle)
        val productDescription: TextView = itemView.findViewById(R.id.tvProductDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_each_item, parent, false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]

        holder.productTitle.text = product.title
        holder.productDescription.text = product.description
        holder.imageProduct.setImageResource(product.image)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, ProductDetailActivity::class.java)
            intent.putExtra("productId", product.id)
            intent.putExtra("productTitle", product.title)
            intent.putExtra("productDescription", product.description)
            intent.putExtra("productImage", product.image)
            context.startActivity(intent)
        }
    }
}
