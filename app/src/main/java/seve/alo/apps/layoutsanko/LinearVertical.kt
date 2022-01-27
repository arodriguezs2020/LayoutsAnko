package seve.alo.apps.layoutsanko

import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class LinearVertical : AnkoComponent<MainActivity> {


    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            imageView(R.drawable.ic_launcher_background).lparams(width = dip(100), height =  dip(100)){
                margin = dip(5)
            }

            verticalLayout {
                textView("textView1")
                textView("textView2")
            }
        }
    }
}