
package com.example.myapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets.add


abstract class MainActivity : AppCompatActivity() {
    private val list: Any

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView=findViewById<ListView>(R.id.listView)
        var mylist= mutableListOf<Model>()

        ///lets add images,tittle and description
        list.add(Model("black-car","black-car description",R.drawable.blackcar))
        list.add(Model("matt","matt description",R.drawable.matt))
        list.add(Model("silver-car","silver-car description",R.drawable.silvercar))
        list.add(Model("whitecar","whitecar description",R.drawable.whitecar))

        listView.adapter=MyAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id:Long ->

            if (position==0){
                Toast.makeText(this@MainActivity,"You have clicked on black-car!",Toast.LENGTH_LONG).show()

            }
            if (position==1){
                Toast.makeText(this@MainActivity,"You have clicked on matt!",Toast.LENGTH_LONG).show()

            }
            if (position==2){
                Toast.makeText(this@MainActivity,"You have clicked on silver-car!",Toast.LENGTH_LONG).show()

            }
            if (position==3){
                Toast.makeText(this@MainActivity,"You have clicked on whitecar!",Toast.LENGTH_LONG).show()

            }



        }
    }
}

}
}