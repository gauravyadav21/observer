package android.gaurav21.com.oberver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fishes = mutableListOf<TropicalFish>(TropicalFish("Yadav"), TropicalFish("Kumar"), TropicalFish("Reddy"))
        var  fishFeeder = FishFeeder()

        for(fish in fishes){
            fishFeeder.addObserver(fish)
        }
        println("We are feeding the fish...")
        fishFeeder.feedTheFish()
    }
}