package ir.mirannoor.mvvmkotlinsimple.Model

import io.reactivex.Observable

class Model {

    fun getDatafromDB(): Observable<String> {
        return Observable.just("MVVM Kotlin Simple")
    }


}