package com.codemobiles.android.cmandroidcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codemobiles.android.cmandroidcompose.model.Course
import com.codemobiles.android.cmandroidcompose.ui.theme.CMAndroidComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CMAndroidComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    val dummyData = arrayListOf<Course>()
                    val dummyDetail = arrayListOf("111", "222", "333")
                    dummyData.add(Course(title = "Odoo ERP Course", image = R.drawable.banner0, detail = dummyDetail))
                    dummyData.add(Course(title = ".NET Core Course", image = R.drawable.banner1, detail = dummyDetail))
                    dummyData.add(Course(title = "Flutter Course", image = R.drawable.banner2, detail = dummyDetail))
                    dummyData.add(Course(title = "iOS SwiftUI Course", image = R.drawable.banner3, detail = dummyDetail))
                    dummyData.add(Course(title = "Android Course", image = R.drawable.banner4, detail = dummyDetail))

                    Column {
                        TopAppBar(title = {
                            Row {
                                Image(
                                    painter = painterResource(R.drawable.cmlogo),
                                    contentDescription = "Description",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(30.dp)
                                        .height(30.dp),
                                )

                                Text("Android Compose Workshop #1",
                                    modifier = Modifier.padding(start = 20.dp),
                                    color = Color.White)
                            }

                        }, backgroundColor= Color(0xFFF97315))
                        CMList(dummyData, onClick = {
                            Toast.makeText(applicationContext, it.title, Toast.LENGTH_SHORT).show()
                        })
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Column {
        Text(text = "Hello $name!")
        Text(text = "Hello $name!")
        Text(text = "Hello $name!")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val dummyData = arrayListOf<Course>()
    val dummyDetail = arrayListOf("111", "222", "333")
    dummyData.add(Course(title = "Odoo ERP Course", image = R.drawable.banner0, detail = dummyDetail))
    dummyData.add(Course(title = ".NET Core Course", image = R.drawable.banner1, detail = dummyDetail))
    dummyData.add(Course(title = "Flutter Course", image = R.drawable.banner2, detail = dummyDetail))
    dummyData.add(Course(title = "iOS SwiftUI Course", image = R.drawable.banner3, detail = dummyDetail))
    dummyData.add(Course(title = "Android Course", image = R.drawable.banner4, detail = dummyDetail))

    CMAndroidComposeTheme {
        CMList(dummyData, onClick = {

        })
    }
}