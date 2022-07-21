package tj.behruz.creditcardmask

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tj.behruz.creditcardmask.main.CardNumberMask
import tj.behruz.creditcardmask.main.ExpiredCardDateMask
import tj.behruz.creditcardmask.ui.theme.CreditCardMaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardMaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AddCardScreen()
                }
            }
        }
    }
}

@Composable
fun AddCardScreen() {
    val context = LocalContext.current
    var cardNumber by remember {
        mutableStateOf("")
    }
    var expiredData by remember {
        mutableStateOf("")
    }
    Scaffold(topBar = {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "backICon",
                modifier = Modifier
                    .padding(start = 16.dp)
                    .clickable {
                        Toast
                            .makeText(context, "navigateBack", Toast.LENGTH_LONG)
                            .show()
                    })
            Text(
                text = "Attach Card",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
            )
        }
    }) {
        Column(modifier = Modifier.fillMaxWidth()) {
            OutlinedTextField(
                value = cardNumber,
                onValueChange = { userInput ->
                    if (userInput.length <= 16) {
                        cardNumber = userInput
                    }
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                visualTransformation = CardNumberMask(" "),
                label = {
                    Text(text = stringResource(R.string.card_number))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            OutlinedTextField(
                value = expiredData,
                onValueChange = { expired ->
                    if (expired.length <= 4) {
                        expiredData = expired
                    }

                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                visualTransformation = ExpiredCardDateMask("/"),
                modifier = Modifier
                    .width(140.dp)
                    .padding(start = 16.dp),
                label = {
                    Text(text = stringResource(R.string.expired_date))
                }

            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Button(modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp), onClick = { }) {
                    Text(text = "Attach card")
                }
            }
        }
    }
}