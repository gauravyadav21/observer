package android.gaurav21.com.oberver

import java.util.*

data class TropicalFish (var name: String) : Observer {

    override fun update(o: Observable?, arg: Any?) {
        println(name + "was jsut fed")
    }

}