package com.codemobiles.android.cmandroidcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.codemobiles.android.cmandroidcompose.model.Course


@Composable
fun CMList(courses:List<Course>, onClick:(Course)->Unit){

    LazyColumn{
        items(courses){
            Surface(modifier = Modifier.clickable {
                onClick(it)
            }) {
                CMCard(course = it, modifier =  Modifier.padding(10.dp))
            }

        }
    }

}