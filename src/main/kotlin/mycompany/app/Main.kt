package mycompany.app

import com.hashicorp.cdktf.App

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val app = App()
        MainStack(app, "cdkexp3", "blah")
        app.synth()
    }
}