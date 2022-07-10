package com.codemobiles.android.cmandroidcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.codemobiles.android.cmandroidcompose.model.Course


@Composable
fun CMCard(course:Course, modifier: Modifier) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp, modifier = modifier) {
        Column {
            Image(
                painter = painterResource(course.image),
                contentDescription = "Description",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp),
            )

            Column(modifier = Modifier.padding(16.dp)) {
                Text(course.title, style = MaterialTheme.typography.h4)
                for (item in course.detail) {
                    Text("• $item")
                }
            }
        }
    }
}