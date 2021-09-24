package so.dugsiile.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.textView) as TextView
        var numOfClicks = 0

        myButton.setOnClickListener{
            numOfClicks +=1
            myTextView.text= numOfClicks.toString()

        }
    }
}