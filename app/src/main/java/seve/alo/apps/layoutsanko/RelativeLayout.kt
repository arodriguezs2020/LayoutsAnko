package seve.alo.apps.layoutsanko

import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class RelativeLayout : AnkoComponent<MainActivity> {


    override fun createView(ui: AnkoContext<MainActivity>) = ui.apply {

        val btnCentro = 1
        val btnArriba = 2
        relativeLayout {
            button("Centro"){
                id = btnCentro
            }.lparams(width = wrapContent){
                centerHorizontally()
                centerVertically()
            }

            button("Arriba"){
                id = btnArriba
            }.lparams(width = wrapContent){
                above(btnCentro)
                alignStart(btnCentro)
            }

            button("Derecha").lparams{
                below(btnArriba)
                rightOf(btnArriba)
            }

            button("Izquierda").lparams{
                leftOf(btnCentro)
                below(btnArriba)
            }

            button("Abajo").lparams{
                alignEnd(btnCentro)
                below(btnCentro)
            }

            button("Superior").lparams{
                alignParentTop()
                alignParentEnd()
            }

        }
    }.view
}