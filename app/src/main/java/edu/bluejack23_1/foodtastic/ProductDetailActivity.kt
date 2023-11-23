package com.dicodingproject.foodtastic

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.dicodingproject.foodtastic.R

class ProductDetailActivity : AppCompatActivity() {

    private lateinit var tvProductTitle : TextView
    private lateinit var tvProductDescription : TextView
    private lateinit var ivProductImage : ImageView
    private lateinit var ivShareButton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        tvProductTitle = findViewById(R.id.tvProductTitle)
        tvProductDescription = findViewById(R.id.tvProductDescription)
        ivProductImage = findViewById(R.id.ivProduct)
        ivShareButton = findViewById(R.id.ivShare)

        val intent = intent
        val productTitle = intent.getStringExtra("productTitle")
        val productDescription = intent.getStringExtra("productDescription")
        val productImage = intent.getIntExtra("productImage", 0)

        // Set data to views
        tvProductTitle.text = productTitle
        tvProductDescription.text = productDescription
        ivProductImage.setImageResource(productImage)

        ivShareButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"

            val shareBody = "Go and Checkout this food!!\n$productTitle\n\nProduct description:\n$productDescription"
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody)

            startActivity(Intent.createChooser(shareIntent, "Share using"))
        }

    }
}
