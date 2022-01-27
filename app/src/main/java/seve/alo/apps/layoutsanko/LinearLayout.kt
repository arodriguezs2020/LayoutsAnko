package seve.alo.apps.layoutsanko

import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LinearLayout : AnkoComponent<MainActivity> {


    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        linearLayout {
            val nombre = editText{
                hint = "¿Cuál es tu nombre?"
                textSize = 15f
            }
            button("presioname"){
                textSize = 25f
                onClick { longToast("Hola, ${nombre.text}!!") }
            }
            button("Botón").lparams(width = wrapContent){
                verticalMargin = dip(50)
                horizontalMargin = dip(50)
            }

            button("Botón 2")
        }
    }
}