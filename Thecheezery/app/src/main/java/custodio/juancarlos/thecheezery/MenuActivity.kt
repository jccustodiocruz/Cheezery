package custodio.juancarlos.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_page)

        val btnColdDrinks: Button = findViewById(R.id.btnColdDrinks) as Button
        val btnHotDrinks: Button = findViewById(R.id.btnHotDrinks) as Button
        val btnSweets: Button = findViewById(R.id.btnSweets) as Button
        val btnSalties: Button = findViewById(R.id.btnSalties) as Button

        btnColdDrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)
        }

        btnHotDrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this, ProductActivity::class.java)
            startActivity(intent)
        }
    }
}