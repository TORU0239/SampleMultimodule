package sg.toru.feature.poi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import sg.toru.base.core.CoreData

class PoiActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    private val coreData:CoreData by lazy {
        CoreData()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poi)

        textView = findViewById(R.id.txtCentre)
        findViewById<Button>(R.id.btnPathToOtherOne).setOnClickListener {
            coreData.test()
            var txt = textView.text
            txt = "$txt\n${coreData.test2()}"
            textView.text = txt
        }
    }
}