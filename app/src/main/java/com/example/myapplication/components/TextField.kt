package com.example.myapplication.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.lifecycle.findViewTreeViewModelStoreOwner
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

    private val viewModel: TextFieldViewModel by lazy { ViewModelProvider(findViewTreeViewModelStoreOwner()!!)[TextFieldViewModel::class.java] }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        binding.button.apply {
            setOnClickListener {
                binding.editText.clearFocus()
                viewModel.validate(binding.editText.text.toString())
            }
        }

        viewModel.isShowError.observe(findViewTreeLifecycleOwner()!!){isShowError ->
            binding.helperText.isVisible = isShowError
        }
    }
}