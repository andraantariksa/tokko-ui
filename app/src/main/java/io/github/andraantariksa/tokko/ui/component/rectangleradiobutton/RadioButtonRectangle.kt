package io.github.andraantariksa.tokko.ui.component.rectangleradiobutton

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import io.github.andraantariksa.tokko.R
import io.github.andraantariksa.tokko.databinding.SquareRadioButtonBinding


class RadioButtonRectangle:
    LinearLayout, RadioCheckable {
    private var checkedChangeListener: ((View, Boolean) -> Unit) = { _, _ -> }
    private lateinit var binding: SquareRadioButtonBinding
    private var isChecked: Boolean = false

    constructor(context: Context?): super(context)

    constructor(context: Context?, attrs: AttributeSet?): super(context, attrs) {
        inflateView(context)
        parseAttributes(attrs)
    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int): super(context, attrs, defStyleAttr) {
        inflateView(context)
        parseAttributes(attrs)
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int): super(context, attrs, defStyleAttr, defStyleRes) {
        inflateView(context)
        parseAttributes(attrs)
    }

    private fun parseAttributes(attrs: AttributeSet?) {
        val a = context.obtainStyledAttributes(
            attrs, R.styleable.RadioButtonRectangle, 0, 0)
        try {
            binding.textViewSquareRadioButtonPrimary.text = a
                .getString(R.styleable.RadioButtonRectangle_textPrimary)
            binding.textViewSquareRadioButtonSecondary.text = a
                .getString(R.styleable.RadioButtonRectangle_textSecondary)
            orientation = a.getInt(R.styleable.RadioButtonRectangle_android_orientation, VERTICAL)
        } finally {
            a.recycle()
        }
    }

    override fun setOnCheckListener(listener: (View, Boolean) -> Unit) {
        this.checkedChangeListener = listener
    }

    override fun setChecked(checked: Boolean) {
        isChecked = checked
    }

    override fun isChecked(): Boolean {
        return isChecked
    }

    override fun toggle() {
        isChecked = !isChecked
    }

    fun setOnCheckedChangeListener(listener: ((View, Boolean) -> Unit)) {
        checkedChangeListener = listener
    }

    private fun inflateView(context: Context?) {
        val inflater = LayoutInflater.from(context)
        binding = SquareRadioButtonBinding.inflate(inflater, this)
    }
}