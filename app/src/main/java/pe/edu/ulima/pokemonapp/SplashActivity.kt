package pe.edu.ulima.pokemonapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent : Intent = Intent(this, MainActivity::class.java)
        
        Timer().schedule(2000) {
            startActivity(intent)
        }
    }
}
