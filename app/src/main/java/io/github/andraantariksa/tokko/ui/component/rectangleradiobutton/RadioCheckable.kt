package io.github.andraantariksa.tokko.ui.component.rectangleradiobutton

import android.view.View
import android.widget.Checkable

interface RadioCheckable: Checkable {
    fun setOnCheckListener(listener: ((View, Boolean) -> Unit))
}
