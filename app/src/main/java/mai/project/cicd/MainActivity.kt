package mai.project.cicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
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
            // 測試閃退報告
//            Crashes.generateTestCrash()
            // 測試事件紀錄
            Analytics.trackEvent(
                "測試事件紀錄",
                mapOf("按鈕名稱" to "Click Me")
            )
        }
    }
}