package mai.project.cicd

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AppCenter.start(
            this,
            "6bc21729-ef7c-4f2a-a952-317429183f97",
            // 監測的服務
            Analytics::class.java, Crashes::class.java
        )
    }
}