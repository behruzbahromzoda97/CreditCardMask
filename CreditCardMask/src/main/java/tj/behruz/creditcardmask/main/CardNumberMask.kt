package tj.behruz.creditcardmask.main

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

/**
This helper class for creating mask to text field in Jetpack Compose
As @params please set separator for mask
@Default format is XXXX XXXX XXXX XXXX
 **/


class CardNumberMask(private val separator: String = " ") : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        return makeCardNumberFilter(text, separator)
    }

    private fun makeCardNumberFilter(text: AnnotatedString, separator: String): TransformedText {
        val formatOfMask = if (text.text.length >= 16) text.text.substring(0..15) else text.text
        var out = ""
        for (i in formatOfMask.indices) {
            out += formatOfMask[i]
            if (i == 3 || i == 7 || i == 11) out += separator
        }

        val offsetMapping = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                return if (offset <= 3) offset
                else if (offset <= 7) offset + 1
                else if (offset <= 11) offset + 2
                else if (offset <= 16) offset + 3
                else 19
            }

            override fun transformedToOriginal(offset: Int): Int {
                return if (offset <= 4) offset
                else if (offset <= 9) offset - 1
                else if (offset <= 14) offset - 2
                else if (offset <= 19) offset - 3
                else 16
            }
        }

        return TransformedText(AnnotatedString(out), offsetMapping)
    }
}