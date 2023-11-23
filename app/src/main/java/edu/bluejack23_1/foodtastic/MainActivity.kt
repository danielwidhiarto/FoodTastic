package com.dicodingproject.foodtastic

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var imageProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageProfile = findViewById(R.id.ivProfile)
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        imageProfile.setOnClickListener {
            val intent = Intent(this, AboutProfileActivity::class.java)
            startActivity(intent)
        }

        val productList = ArrayList<Product>()

        productList.add(
            Product(
                "1",
                "Sushi",
                "Sushi is an exquisite Japanese delicacy made with vinegared rice, fresh seafood, and various ingredients. This culinary art form has captivated taste buds worldwide with its intricate preparation and harmonious blend of flavors. Sushi comes in a variety of forms, such as Nigiri, Sashimi, and Maki rolls, offering a delightful culinary experience that showcases the artistry and culinary heritage of Japan.",
                R.mipmap.sushi
            )
        )

        productList.add(
            Product(
                "2",
                "Pizza",
                "Pizza, a classic Italian comfort food, is known for its thin or thick crust, topped with tomato sauce, cheese, and various toppings. This culinary masterpiece has conquered hearts and palates across the globe with its versatility and endless flavor combinations. From the classic Margherita to the adventurous Hawaiian, pizza reflects the Italian passion for food and the joy of sharing a delicious meal with friends and family.",
                R.mipmap.pizza
            )
        )

        productList.add(
            Product(
                "3",
                "Tacos",
                "Tacos, a flavorful and spicy Mexican street food delight, are a symphony of textures and tastes that epitomize the culinary spirit of Mexico. These handheld creations consist of a folded or rolled tortilla filled with a variety of ingredients such as seasoned meat, beans, cheese, and fresh toppings like salsa and guacamole. Each bite of a taco is an explosion of flavors, transporting you to the vibrant streets of Mexico and immersing you in the rich culinary traditions of this beloved cuisine.",
                R.mipmap.tacos
            )
        )

        productList.add(
            Product(
                "4",
                "Burger",
                "The burger, an iconic All-American favorite, is a testament to the simplicity and satisfaction of a well-crafted meal. This culinary classic features a ground meat patty, usually beef, placed inside a sliced bun. The beauty of the burger lies in its endless customization options, allowing you to tailor your burger experience to your liking. With a vast array of toppings, condiments, and cheese varieties, the burger is a blank canvas for culinary creativity, satisfying every palate and preference.",
                R.mipmap.burger
            )
        )

        productList.add(
            Product(
                "5",
                "Dim Sum",
                "Dim Sum, a culinary tradition deeply rooted in Chinese culture, is a feast for the senses and a celebration of culinary artistry. These bite-sized dishes, served in small steamer baskets or on small plates, are intricate creations that showcase the skill and creativity of Dim Sum chefs. From delicate dumplings filled with a medley of flavors to fluffy buns and crispy rolls, Dim Sum offers a tantalizing journey through the culinary landscape of China, leaving a lasting impression on every diner.",
                R.mipmap.dimsum
            )
        )

        productList.add(
            Product(
                "6",
                "Pasta",
                "Pasta, a staple of Italian cuisine, is a culinary masterpiece that has captivated the world with its versatility and endless flavor possibilities. This culinary creation, made from unleavened dough, typically wheat and water or eggs, comes in various shapes and sizes, each with its unique characteristics and culinary applications. Pasta is often paired with rich and flavorful sauces made from ingredients such as tomatoes, garlic, and herbs, resulting in a symphony of textures and tastes that has earned it a place among the most beloved dishes in the world.",
                R.mipmap.pasta
            )
        )

        productList.add(
            Product(
                "7",
                "Curry",
                "Curry, a culinary jewel of Indian cuisine, is renowned for its bold and complex flavors that ignite the senses and transport you to the vibrant streets of India. This aromatic dish features meat or vegetables cooked in a flavorful blend of spices, herbs, and other ingredients, creating a symphony of tastes that is both tantalizing and comforting. Often served with rice or bread, curry is a culinary adventure that will leave you craving more, eager to explore the endless variations and regional specialties of this culinary treasure.",
                R.mipmap.curry
            )
        )

        productList.add(
            Product(
                "8",
                "Miso Soup",
                "Miso soup, a traditional Japanese soup, is a culinary embodiment of simplicity and flavor. This comforting dish is made with dashi broth and fermented soybean paste (miso), creating a warm and umami-rich experience that is both nourishing and satisfying. Often containing seaweed, tofu, and green onions, miso soup showcases the Japanese philosophy of balance and harmony, offering a culinary respite that is both delicate and flavorful.",
                R.mipmap.misosoup
            )
        )
        productList.add(
            Product(
                "9",
                "Ice Cream",
                "Ice cream, a frozen dessert that has delighted palates worldwide, is a culinary masterpiece that epitomizes indulgence and delight. This frozen treat comes in countless flavors and varieties, made from dairy or non-dairy ingredients, offering a symphony of sweet sensations that can transport you to a state of pure bliss. Whether you're a fan of classic flavors like vanilla and chocolate or crave more adventurous options like pistachio and lavender, ice cream is a culinary journey that never fails to satisfy.",
                R.mipmap.icecream
            )
        )

        productList.add(
            Product(
                "10",
                "Steak",
                "Steak, a culinary icon renowned for its succulent, juicy flavors, is a testament to the art of grilling and the passion for meat. This culinary masterpiece, often served with flavorful sauces and side dishes, is a symbol of indulgence and satisfaction. From the tender ribeye to the flavorful filet mignon, steak showcases the versatility of beef and the culinary creativity that can transform this humble ingredient into a culinary masterpiece.",
                R.mipmap.steak
            )
        )

        productList.add(
            Product(
                "11",
                "Sashimi",
                "Sashimi, a culinary delicacy originating from Japan, showcases the purity and freshness of the finest seafood. This artful dish consists of thinly sliced raw fish, typically served without rice, allowing the delicate flavors of the seafood to shine through. Sashimi is often accompanied by soy sauce, wasabi, and pickled ginger, creating a harmonious blend of flavors that is both clean and refreshing.",
                R.mipmap.sashimi
            )
        )

        productList.add(
            Product(
                "12",
                "Peking Duck",
                "Peking Duck, a culinary legend from China, is renowned for its crispy skin and succulent meat. This iconic dish features a whole duck that is meticulously roasted until its skin becomes golden and crispy, revealing tender and flavorful meat beneath. Peking Duck is traditionally carved tableside and served with thin pancakes, hoisin sauce, and sliced scallions, providing a symphony of textures and flavors that is both tantalizing and satisfying.",
                R.mipmap.pekingduck
            )
        )

        productList.add(
            Product(
                "13",
                "Pad Thai",
                "Pad Thai, a popular Thai street food dish, is a culinary masterpiece that embodies the vibrant flavors of Thailand. This stir-fried noodle dish features rice noodles combined with a medley of ingredients such as shrimp, tofu, peanuts, bean sprouts, and lime, creating a symphony of sweet, savory, and tangy flavors that is both refreshing and satisfying. Pad Thai is a culinary embodiment of Thai cuisine's ability to balance diverse flavors and textures, making it a beloved dish enjoyed worldwide.",
                R.mipmap.padthai
            )
        )

        productList.add(
            Product(
                "14",
                "Croissant",
                "The croissant, a flaky and buttery French pastry, is a culinary delight that has captivated taste buds worldwide. This iconic pastry is made with layered dough, creating a crispy exterior and a soft, melt-in-your-mouth interior. Croissants are often enjoyed for breakfast or as a snack, offering a delightful contrast of textures and flavors that is both satisfying and indulgent. Whether plain or filled with various ingredients, the croissant remains a timeless classic that has earned its place among the most beloved pastries in the world.",
                R.mipmap.croissant
            )
        )
        productList.add(
            Product(
                "15",
                "Tiramisu",
                "Tiramisu, a classic Italian dessert, is a symphony of flavors and textures that has captivated dessert lovers worldwide. This decadent treat consists of layers of coffee-soaked ladyfingers layered with mascarpone cheese, dusted with cocoa powder. Tiramisu is known for its rich, indulgent flavors, making it a favorite among those who appreciate a truly decadent dessert experience. The combination of coffee, mascarpone cheese, and cocoa powder creates a harmonious blend of flavors and textures that is both comforting and satisfying ",
                R.mipmap.tiramisu
            )
        )
        productList.add(
            Product(
                "16",
                "Pho",
                "Pho, a Vietnamese noodle soup, is a culinary masterpiece that has captured the hearts and taste buds of people worldwide. This comforting and flavorful dish features a rich and aromatic broth, rice noodles, and a variety of toppings such as herbs, bean sprouts, and lime, creating a symphony of flavors that is both soothing and satisfying. Pho is a testament to the culinary heritage of Vietnam and its ability to create dishes that are both simple and complex, appealing to a wide range of palates.",
                R.mipmap.pho
            )
        )

        productList.add(
            Product(
                "17",
                "Gyoza",
                "Gyoza, Japanese dumplings filled with ground meat and vegetables, are a culinary delight that is both savory and satisfying. These small, pleated dumplings are typically pan-fried or steamed, offering a variety of textures to tantalize the taste buds. Gyoza is often served with a dipping sauce, allowing the flavors to mingle and create a harmonious blend of umami and savory notes. Whether enjoyed as a main course or as an appetizer, gyoza is a culinary gem that is sure to please both seasoned foodies and novices alike.",
                R.mipmap.gyoza
            )
        )

        productList.add(
            Product(
                "18",
                "Risotto",
                "Risotto, an Italian rice dish, is a culinary masterpiece that showcases the art of slow cooking and the delicate balance of flavors. This creamy and comforting dish is made by slowly stirring risotto rice in broth, gradually releasing its starch and creating a velvety texture. Risotto is often flavored with various ingredients such as mushrooms, saffron, and Parmesan cheese, resulting in a dish that is both rich and satisfying. With its endless variations and regional specialties, risotto is a culinary treasure that continues to delight and amaze food enthusiasts worldwide.",
                R.mipmap.risotto
            )
        )

        productList.add(
            Product(
                "19",
                "Ceviche",
                "Ceviche, a refreshing Latin American dish, is a culinary gem that showcases the versatility of raw seafood. This delicate dish features raw fish or seafood marinated in citrus juices, such as lime or lemon, creating a symphony of flavors that is both tangy and refreshing. Ceviche is often seasoned with herbs, chili peppers, and served with accompaniments like avocado and corn, providing a burst of textures and tastes that is both vibrant and satisfying. Whether enjoyed as an appetizer or a main course, ceviche is a culinary adventure that will tantalize your taste buds and leave you craving more.",
                R.mipmap.ceviche
            )
        )

        productList.add(
            Product(
                "20",
                "Mango Sticky Rice",
                "Mango Sticky Rice, a popular Thai dessert, is a delightful fusion of sweet and creamy flavors that is sure to satisfy your sweet tooth. This refreshing dessert features sweet sticky rice topped with ripe mango slices and drizzled with coconut milk, creating a harmonious blend of textures and flavors that is both comforting and indulgent. The sweetness of the sticky rice, the tanginess of the mango, and the richness of the coconut milk combine to create a dessert that is truly irresistible. Whether enjoyed as a light snack or a decadent treat, Mango Sticky Rice is a culinary masterpiece that will leave you wanting more.",
                R.mipmap.mangostickyrice
            )
        )

        productAdapter = ProductAdapter(productList)
        recyclerView.adapter = productAdapter
    }
}