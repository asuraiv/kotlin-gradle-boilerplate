package com.asuraiv.kotlinpractice.`object`

class ObjectTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            val button = Button()

            button.showOff()

            button.setFocus(true)

            button.click()
        }
    }
}