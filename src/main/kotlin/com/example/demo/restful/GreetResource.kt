package com.example.demo.restful

import org.springframework.stereotype.Component
import java.util.*
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Component
@Path("kk/{name}")
class GreetResource{

    data class Model(val id:Int,val name:String,val time:String)

    @GET
    @Produces(MediaType.APPLICATION_JSON)
     fun greet(@PathParam("name") name:String):Response{
        val random=(Math.random()*1000).toInt()
        return Response.ok(Model(random,name, Date().toString())).build()
    }

}


data class Model(val id:Int,val name:String,val mob:String)