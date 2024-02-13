package mai.project.cicd

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MyApp : Application() {dd

    override fun onCreate() {
        super.onCreate()
        AppCenter.start(
            this,
            "9040ed49-f469-4765-984f-9e2f110eb86e",
            // 監測的服務
            Analytics::class.java, Crashes::class.java
        )
    }
}