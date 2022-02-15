package controller

import model.MusicGender
import kotlin.time.Duration

class Music {
    //Parâmetros do mêtodo Factory
    fun musicFactory(
        title: String,
        duration: Short,
        musicGender: MusicGender,
        dateRelease: Short,
        album: String,
        composer: String,
        record: String
    ) = model.Music(
        title = title,
        duration = duration,
        musicGender = musicGender,
        dateRelease = dateRelease,
        album = album,
        composer = composer,
        record = record,


        )
}