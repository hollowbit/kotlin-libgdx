package net.hollowbit.kotlingame

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class KotlinGame : ApplicationAdapter() {

    companion object {
        const val SPEED = 100
    }

    private lateinit var texture: Texture
    private lateinit var batch: SpriteBatch

    private var x = 0f
    private var y = 0f

    override fun create() {
        super.create()
        texture = Texture("texture.png")
        batch = SpriteBatch()
    }

    override fun render() {
        Gdx.gl.glClearColor(0f, 0f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        if (Gdx.input.isKeyPressed(Input.Keys.W))
            y += Gdx.graphics.deltaTime * SPEED * 2
        if (Gdx.input.isKeyPressed(Input.Keys.A))
            x -= Gdx.graphics.deltaTime * SPEED
        if (Gdx.input.isKeyPressed(Input.Keys.S))
            y -= Gdx.graphics.deltaTime * SPEED
        if (Gdx.input.isKeyPressed(Input.Keys.D))
            x += Gdx.graphics.deltaTime * SPEED

        batch.begin()
        batch.draw(texture, x, y)
        batch.end()
    }

}