package com.example.myapplication.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.myapplication.databinding.TextFieldBinding


class TextField @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(
    context,
    attr,
    defStyleAttr,
    defStyleRes
) {
    private val binding: TextFieldBinding by lazy { TextFieldBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    ) }

    init {
        binding
    }
}