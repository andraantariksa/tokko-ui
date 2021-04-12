package io.github.andraantariksa.tokko.ui.component.rectangleradiobutton

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.RequiresApi


class RadioButtonGroup: LinearLayout {
    private var checkedChangeListener: ((View, Boolean) -> Unit) = { _, _ -> }
//    private lateinit var passThroughListener: PassThroughHierarchyChangeListener

    constructor(context: Context?): super(context)

    constructor(context: Context?, attrs: AttributeSet?): super(context, attrs) {
        parseAttributes(attrs)
    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int): super(context, attrs, defStyleAttr) {
        parseAttributes(attrs)
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int): super(context, attrs, defStyleAttr, defStyleRes) {
        parseAttributes(attrs)
    }

    private fun parseAttributes(attrs: AttributeSet?) {
        val a = context.obtainStyledAttributes(
            attrs, io.github.andraantariksa.tokko.R.styleable.RadioButtonGroup, 0, 0
        )
        try {

        } finally {
            a.recycle()
        }
    }

//    private fun setupView() {
//        passThroughListener = PassThroughHierarchyChangeListener(this)
//    }
//
//    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
//        if (child is RadioButtonRectangle) {
//            if (child.isChecked) {
//
//            }
//        }
//        super.addView(child, index, params)
//    }
//
//    fun setOnCheckedChangeListener(listener: ((View, Boolean) -> Unit)) {
//        checkedChangeListener = listener
//    }
//
//    override fun setOnHierarchyChangeListener(listener: OnHierarchyChangeListener?) {
//        passThroughListener.onHierarchyChangeListener = listener
//    }
//
//    class PassThroughHierarchyChangeListener(private val parentView: View): ViewGroup.OnHierarchyChangeListener {
//        var onHierarchyChangeListener: ViewGroup.OnHierarchyChangeListener? = null
//
//        override fun onChildViewAdded(parent: View?, child: View?) {
//
//        }
//
//        override fun onChildViewRemoved(parent: View?, child: View?) {
////            if (parent == parentView && child is RadioCheckable) {
////                (child as RadioCheckable).removeOnCheckChangeListener(mChildOnCheckedChangeListener)
////            }
////            mChildViewsMap.remove(child
//        //            !!.id)
////            if (mOnHierarchyChangeListener != null) {
////                mOnHierarchyChangeListener.onChildViewRemoved(parent, child)
////            }
//        }
//    }
}