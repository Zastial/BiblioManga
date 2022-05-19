package bibliomanga

import bibliomanga.vue.Vue
import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage


class Main:Application() {

    override fun start(primaryStage: Stage) {


        val vue = Vue()


        val scene = Scene(vue, 550.0, 350.0)
        primaryStage.title="TD5B MVC"
        primaryStage.scene=scene
        primaryStage.show()
    }
}

fun main(){
    Application.launch(Main::class.java)
}



