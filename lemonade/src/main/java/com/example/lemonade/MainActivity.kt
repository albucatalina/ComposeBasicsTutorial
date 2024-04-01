package com.example.lemonade

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Lemonade()
                }
            }
        }
    }
}

@Composable
fun Lemonade(modifier: Modifier = Modifier){
    var imageIndex by remember { mutableStateOf(0) }
    val images = listOf(
        R.drawable.lemon_tree,
        R.drawable.lemon_squeeze,
        R.drawable.lemon_drink,
        R.drawable.lemon_restart
    )
    val stringResources = listOf(
        R.string.lemon_tree_text,
        R.string.lemon_squeeze_text,
        R.string.lemon_drink_text,
        R.string.lemon_restart_text
    )
    val contentDescriptions = listOf(
        R.string.cd_lemon_tree,
        R.string.cd_lemon_squeeze,
        R.string.cd_lemon_drink,
        R.string.cd_lemon_restart
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = images[imageIndex]),
            contentDescription = stringResource(id = contentDescriptions[imageIndex]),
            Modifier.clickable {
                if(imageIndex == 3)
                    imageIndex = 0
                else
                    imageIndex++
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(id = stringResources[imageIndex]),
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadePreview(){
    LearnTogetherTheme {
        Lemonade()
    }
}