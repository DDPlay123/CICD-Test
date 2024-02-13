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
            BuildConfig.APP_CENTER_SECRET,
            // 監測的服務
            Analytics::class.java, Crashes::class.java
        )
    }
}