package pl.kondziet.macau

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MacauApplication

fun main(args: Array<String>) {
    runApplication<MacauApplication>(*args)
}
