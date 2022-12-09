package com.example.part2dz

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {

    var frag1: Fragment1? = null
    var frag2: Fragment2? = null
    var fTrans: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        frag1 = Fragment1()
        frag2 = Fragment2()

        val button1: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)

        button1.setOnClickListener {
            if(fTrans == null){
                fTrans = supportFragmentManager.beginTransaction()
                fTrans!!.replace(R.id.frame, frag1!!)
                fTrans!!.commit()
            } else {
                fTrans = supportFragmentManager.beginTransaction()
                fTrans!!.replace(R.id.frame, frag1!!)
                fTrans!!.commit()
            }
        }

        button2.setOnClickListener {
            if(fTrans == null){
                fTrans = supportFragmentManager.beginTransaction()
                fTrans!!.replace(R.id.frame, frag2!!)
                fTrans!!.commit()
            } else {
                fTrans = supportFragmentManager.beginTransaction()
                fTrans!!.replace(R.id.frame, frag2!!)
                fTrans!!.commit()
            }
        }
    }
}