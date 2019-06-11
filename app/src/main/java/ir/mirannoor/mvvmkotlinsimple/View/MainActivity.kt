package ir.mirannoor.mvvmkotlinsimple.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ir.mirannoor.mvvmkotlinsimple.R
import ir.mirannoor.mvvmkotlinsimple.ViewModel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Define viewModel
    lateinit var viewModel: ViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Instance of ViewModel
        viewModel = ViewModelProviders.of(this).get(ViewModel::class.java)

        //Get data from ViewModel by LiveData
        viewModel.observable.observe(this, Observer { Toast.makeText(this@MainActivity, it, Toast.LENGTH_LONG).show() })

        btn.setOnClickListener {
            //Send data from View to ViewModel.
            viewModel.getUser()
        }


    }
}
