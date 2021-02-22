package custodio.juancarlos.thecheezery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_page)

        val button: Button = findViewById(R.id.btnSignIn)as Button

        button.setOnClickListener{
            var intent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}