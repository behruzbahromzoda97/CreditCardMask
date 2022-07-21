package tj.behruz.creditcardmask.main

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

class ExpiredCardDateMask(private val separator: String = "/") : VisualTransformation {

    override fun filter(text: AnnotatedString): TransformedText {
        val expiredCardDate = if (text.text.length >= 4) text.text.substring(0..3) else text.text
        var out = ""
        for (i in expiredCardDate.indices) {
            out += expiredCardDate[i]
            if (i == 1) out += separator
        }

        val offsetMapping = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                if (offset <= 1) return offset
                if (offset <= 4) return offset + 1
                return 5
            }

            override fun transformedToOriginal(offset: Int): Int {
                if (offset <= 2) return offset
                if (offset <= 5) return offset - 1
                return 4
            }


        }
        return TransformedText(AnnotatedString(out), offsetMapping)
    }
}