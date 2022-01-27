package seve.alo.apps.layoutsanko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // VerticalLayout().setContentView(this)
        // LinearLayout().setContentView(this)
        // LinearVertical().setContentView(this)
        // RelativeLayout().setContentView(this)
        VerticalLayoutLogin().setContentView(this)
    }
}