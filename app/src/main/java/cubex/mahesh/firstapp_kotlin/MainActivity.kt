package cubex.mahesh.firstapp_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   /*     gt.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                tv1.text = et1.text
            }
        }) */

        gt.setOnClickListener {
            tv1.text = et1.text
        }


    } //onCreate
} // MainActivity
