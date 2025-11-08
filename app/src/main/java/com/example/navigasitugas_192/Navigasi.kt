package com.example.navigasitugas_192




import androidx.compose.animation.AnimatedContentScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasitugas_192.view.Awal
import com.example.navigasitugas_192.view.TampilData
import com.example.navigasitugas_192.view.Form


enum class Navigasi {
    Formulirku,
    Detail,
    Homepage,
}

