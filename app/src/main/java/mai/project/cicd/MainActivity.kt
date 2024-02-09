package mai.project.cicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mai.project.cicd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener {
            Toast.makeText(this, "Click Me", Toast.LENGTH_SHORT).show()
        }
    }
}