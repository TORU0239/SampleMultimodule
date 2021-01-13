package sg.toru.feature.poi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sg.toru.base.core.CoreData

class PoiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poi)

        CoreData().test()
    }
}