package sg.toru.samplemultimodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import sg.toru.base.core.CoreData
import sg.toru.feature.poi.PoiActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoreData().test()

        findViewById<Button>(R.id.btnGoToPoi).setOnClickListener {
            val intent = Intent(this@MainActivity, PoiActivity::class.java)
            startActivity(intent)
        }
    }
}