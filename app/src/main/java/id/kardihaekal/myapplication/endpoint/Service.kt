package id.kardihaekal.myapplication.endpoint

import id.kardihaekal.myapplication.model.Github
import retrofit.http.GET
import retrofit.http.Path
import rx.Observable

interface Service {

    @GET("users/{username}")
    fun getUser(@Path("username") username:String): Observable<Github>

}