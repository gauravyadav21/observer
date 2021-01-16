package android.gaurav21.com.oberver

import java.util.*

class FishFeeder: Observable() {

    fun feedTheFish(){
        setChanged()
        notifyObservers()
    }
}