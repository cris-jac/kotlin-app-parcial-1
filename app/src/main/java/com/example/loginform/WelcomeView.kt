package com.example.loginform

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginform.ui.theme.LoginFormTheme

@Composable
fun WelcomeView(
    modifier: Modifier = Modifier
) {
    val name = "Pedro Pe"

    Column (
        modifier = modifier.padding(20.dp)
    ) {
        Column (modifier = modifier.align(Alignment.CenterHorizontally).padding(top = 200.dp)) {
            Text(
                text = "Bienvenido $name",
                style = MaterialTheme.typography.titleLarge,
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
    LoginFormTheme {
        WelcomeView()
    }
}