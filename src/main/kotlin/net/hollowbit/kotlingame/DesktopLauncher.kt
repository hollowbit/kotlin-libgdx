package net.hollowbit.kotlingame

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

fun main(args : Array<String>) {
    val config = LwjglApplicationConfiguration()
    config.title = "KotlinGame"
    config.width = 1280
    config.height = 720
    LwjglApplication(KotlinGame(), config)
}