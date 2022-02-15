package view

import model.MusicGender

fun main() {
    val musicController = controller.Music()
    val batomDeCereja = musicController.musicFactory(
        title = "Batom de cereja",
        duration = 150,
        musicGender = MusicGender.Sertanejo,
        album = "Aqui e agora vol.1",
        dateRelease = 2021,
        record = "Sony Records",
        composer = "Israel e Rodolpho"


        )
    println(batomDeCereja)
}