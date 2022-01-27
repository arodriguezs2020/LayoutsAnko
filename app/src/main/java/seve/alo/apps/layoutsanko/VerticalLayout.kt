package seve.alo.apps.layoutsanko

import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class VerticalLayout : AnkoComponent<MainActivity>{


    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            val nombre = editText{
                hint = "¿Cuál es tu nombre?"
                textSize = 15f
            }
            button("Botón"){
                textSize = 25f
                onClick { longToast("Hola, ${nombre.text}!!") }
            }
        }
    }
}