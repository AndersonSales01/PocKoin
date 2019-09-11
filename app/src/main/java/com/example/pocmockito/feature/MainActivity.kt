package com.example.pocmockito.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.example.pocmockito.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val cm = ViewModelProviders.of(this).get(MainViewModel::class.java)

        btn_action.setOnClickListener {
            mainViewModel.getEmail()
        }

        observables()
    }

    fun observables(){
        mainViewModel.getMessageLiveData().observe( this, Observer {res->

            if (res != ""){
                //Toast.makeText(this,res,Toast.LENGTH_SHORT).show()
                txt_value.text = res
            }

        })

    }
}
