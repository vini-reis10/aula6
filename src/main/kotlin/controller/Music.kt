package controller

import model.MusicGender
import kotlin.time.Duration

class Music {
    //Parâmetros do mêtodo Factory
    fun musicFactory(Title:String,
                     duration:Short,
                     musicGender: MusicGender,
                     dateRelease: Short,
                     album: String,
                     composer: String,
                     record: String
    // Cosntrutor da class Music do model
                     ) = model.Music()
}