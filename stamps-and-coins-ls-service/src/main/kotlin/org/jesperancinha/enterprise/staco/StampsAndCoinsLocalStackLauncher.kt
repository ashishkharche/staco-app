package org.jesperancinha.enterprise.staco

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties

@EnableConfigurationProperties
@SpringBootApplication
class StampsAndCoinsLocalStackLauncher

fun main(args: Array<String>) {
    SpringApplication.run(StampsAndCoinsLocalStackLauncher::class.java, *args)
}

