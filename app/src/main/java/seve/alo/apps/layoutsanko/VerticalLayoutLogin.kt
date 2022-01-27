package seve.alo.apps.layoutsanko

import android.os.Build
import android.view.ContentInfo
import android.view.Gravity
import android.view.View
import android.widget.EditText
import androidx.core.content.ContextCompat
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class VerticalLayoutLogin : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

        verticalLayout {

            gravity = Gravity.CENTER

            scrollView {
                verticalLayout {
                    verticalLayout {
                        gravity = Gravity.CENTER
                        lparams(width = matchParent, height = matchParent){
                            doFromSdk(version = Build.VERSION_CODES.JELLY_BEAN) {
                                background = ContextCompat.getDrawable(ctx, android.R.color.white)
                            }
                        }
                        padding = dip(20)

                        editText {
                            id = R.id.editTextUsuario
                            hint = "Usuario"
                        }.lparams(width = matchParent, height = wrapContent)

                        editText {
                            id = R.id.editTextPass
                            hint = "Password"
                        }.lparams(width = matchParent, height = wrapContent)

                        button{
                            id = R.id.btnLogin
                            textResource = R.string.btnLogin
                            onClick {

                            }
                        }.lparams(width = matchParent, height = wrapContent)
                    }.applyRecursively { view ->
                        when (view) {
                            is EditText -> view.textSize = 24f
                        }
                    }
                }
            }
        }
    }
}