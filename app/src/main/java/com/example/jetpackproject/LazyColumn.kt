package com.example.jetpackproject

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumn(modifier: Modifier = Modifier) {

    Spacer(Modifier.padding(20.dp))

    LazyColumn(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center){
        items(50){
            Text("Item $it", Modifier.padding(16.dp))
        }

    }

}