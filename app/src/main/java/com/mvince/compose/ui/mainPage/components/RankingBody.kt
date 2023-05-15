package com.mvince.compose.ui.ranking

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.mvince.compose.ui.signin.SigninViewModel
import java.util.concurrent.Flow

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RankingBody(navController: NavHostController) {

    val viewModel = hiltViewModel<SigninViewModel>()
    var user by remember { mutableStateOf("") }

    data class member(val name: String, val score: Int)

    var cpt = 0
    val cardModifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .clickable { false }
    val test = listOf<member>(
        member("Pipoune", 500),
        member("Yanis", 500),
        member("David", 500),
        member("You", 1),
        member("You", 1),
        member("You", 1),
        member("You", 1),
        member("You", 1),
        member("You", 1),
        member("You", 1),
        member("You", 1),
        member("You", 1),
        member("You", 1),
        member("You", 1),
    );


    LazyColumn(
        Modifier
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        items(test) { hu ->
            cpt += 1
            ListItem(
                leadingContent = {
                    Text(
                        text = cpt.toString()
                    )
                },
                headlineText = { Text(
                    text = hu.name.toString()
                ) },
                trailingContent = { Text(
                    text = hu.score.toString()
                ) }
            )
                }
            }
        }

