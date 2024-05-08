package com.example.loginform

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.loginform.ui.theme.LoginFormTheme

@Composable
fun LoginView(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val emailToCheck = "pedro@pe.com.ar"
    val passwordtoCheck = "abc123"

    var email by remember {
        mutableStateOf("Email")
    }
    var password by remember {
        mutableStateOf("Contraseña")
    }

    var showErrorMessage by remember {
        mutableStateOf(false)
    }
    


    Column (
        modifier = modifier.padding(20.dp)
    )  {
        Column (modifier = modifier.weight(1f).align(Alignment.CenterHorizontally).padding(top = 200.dp)) {
            if (showErrorMessage) {
                Text(
                    text = "Error al iniciar sesion. Verifique sus datos",
                    color = Color.Red
                )
            }
            Text(
                text = "Iniciar sesion",
                style = MaterialTheme.typography.titleMedium,
                modifier = modifier.align(Alignment.CenterHorizontally).padding(top = 20.dp, bottom = 20.dp)
            )
            Column {
                TextField(
                    value = email,
                    onValueChange = { newEmail ->
                        email = newEmail
                    },
                    modifier = modifier.padding(top = 10.dp, bottom = 10.dp)
                )
                TextField(
                    value = password,
                    onValueChange = { newPassword -> password = newPassword },
                    modifier = modifier.padding(top = 10.dp, bottom = 10.dp)
                )
            }
            Button(
                onClick = {
                    if (email == emailToCheck && password == passwordtoCheck)
                    {
                        navController.navigate("welcome")
                    } else {
                        showErrorMessage = true
                    }
                },
                modifier = modifier.align(Alignment.CenterHorizontally).padding(top = 30.dp)
            ) {
                Text(text = "Iniciar sesion")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    LoginFormTheme {
        LoginView(rememberNavController())
    }
}

