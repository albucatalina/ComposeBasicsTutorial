package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.LearnTogetherTheme

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
                    ComposeQuadrant()
                }
            }
        }
    }

    @Composable
    fun ComposeQuadrant(){
        Column{
            Row(
                modifier = Modifier.weight(0.5f)
            ) {
                ComposeCard(
                    title = stringResource(R.string.text_composable_title),
                    description = stringResource(R.string.text_composable_description),
                    backgroundColor = Color(0xFFEADDFF),
                    modifier = Modifier.weight(0.5f)
                )

                ComposeCard(
                    title = stringResource(R.string.image_composable_title),
                    description = stringResource(R.string.image_composable_description),
                    backgroundColor = Color(0xFFD0BCFF),
                    modifier = Modifier.weight(0.5f)
                )
            }

            Row(
                modifier = Modifier.weight(0.5f)
            ) {
                ComposeCard(
                    title = stringResource(R.string.row_composable_title),
                    description = stringResource(R.string.row_composable_description),
                    backgroundColor = Color(0xFFB69DF8),
                    modifier = Modifier.weight(0.5f)
                )

                ComposeCard(
                    title = stringResource(R.string.column_composable_title),
                    description = stringResource(R.string.column_composable_description),
                    backgroundColor = Color(0xFFF6EDFF),
                    modifier = Modifier.weight(0.5f)
                )
            }
        }
    }

    @Composable
    fun ComposeCard(title: String, description: String, backgroundColor: Color, modifier: Modifier = Modifier){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .background(backgroundColor)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = title,
                textAlign = TextAlign.Justify,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ComposeQuadrantPreview(){
        LearnTogetherTheme {
            ComposeQuadrant()
        }
    }
}