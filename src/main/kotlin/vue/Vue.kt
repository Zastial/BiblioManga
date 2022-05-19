package bibliomanga.vue

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import javafx.scene.layout.FlowPane
import javafx.scene.layout.GridPane
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.FontPosture
import javafx.scene.text.FontWeight

class Vue : BorderPane() {

    var grilleLivres: GridPane
    var searchBar : TextField

    init {
        this.grilleLivres = GridPane()
        this.searchBar = TextField()


        // le titre en haut
        val flowPaneTop = FlowPane()
        val labelTop = Label("Ma BiblioManga")
        labelTop.font = Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 20.0)
        labelTop.textFill = Color.BLACK
        flowPaneTop.alignment = Pos.CENTER
        labelTop.padding = Insets(10.0)
        flowPaneTop.children.add(labelTop)
        this.top = flowPaneTop
    }

}