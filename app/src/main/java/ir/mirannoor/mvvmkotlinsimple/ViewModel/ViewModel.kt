package ir.mirannoor.mvvmkotlinsimple.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


//ViewModel---> androidx.lifecycle
class ViewModel : ViewModel() {


    //Define LiveData in ViewModel.
    val observable = MutableLiveData<String>()




    fun getUser() {

        //Send data from "ViewModel to View"
        observable.value = "Mahmoud"
    }


}