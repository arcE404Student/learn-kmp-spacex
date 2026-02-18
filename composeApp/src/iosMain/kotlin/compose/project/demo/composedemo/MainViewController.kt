package compose.project.demo.composedemo

import androidx.compose.ui.window.ComposeUIViewController
import compose.project.demo.composedemo.di.modules.initKoin

fun MainViewController() = ComposeUIViewController(configure = { initKoin() }) { App() }