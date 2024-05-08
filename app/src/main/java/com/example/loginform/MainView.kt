package com.example.loginform

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginform.ui.theme.LoginFormTheme

@Composable
fun MainView(modifier: Modifier = Modifier) {
    val emailToCheck = "pepe"
    val passwordtoCheck = "123"

    val email = "Email"
    val password = "Contraseña"

    val navController = rememberNavController()

    Scaffold (modifier = modifier) {

            NavHost(
                navController = navController,
                modifier = modifier.padding(it),
                startDestination = "login"
            ) {
                composable("login") { LoginView(navController = navController) }
                composable("welcome") { WelcomeView() }
            }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    LoginFormTheme {
        MainView()
    }
}