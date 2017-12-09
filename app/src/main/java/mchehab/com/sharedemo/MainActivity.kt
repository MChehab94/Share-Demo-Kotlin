package mchehab.com.sharedemo

import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, editText.text.toString())
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent, "Select the app you want to share with"))
        }

    }
}
