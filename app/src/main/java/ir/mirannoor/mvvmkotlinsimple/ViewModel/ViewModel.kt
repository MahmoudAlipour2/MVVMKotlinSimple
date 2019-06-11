package ir.mirannoor.mvvmkotlinsimple.ViewModel

import android.annotation.SuppressLint
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ir.mirannoor.mvvmkotlinsimple.Model.Model


//ViewModel---> androidx.lifecycle
class ViewModel : ViewModel() {


    //Define LiveData in ViewModel.
    val observable = MutableLiveData<String>()


    //Instance of Model
    val repository = Model()


    fun getUser() {
        //get data from Model and send it to View.
        repository.getDatafromDB().subscribe({
            observable.value = it
        }, {
            Log.d("onError", it.message)
        }, {
            Log.d("onComplete", "Get Data Completed.")
        })


    }


}