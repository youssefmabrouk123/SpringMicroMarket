package tn.ensit.discorery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class DiscoreryApplication

fun main(args: Array<String>) {
	runApplication<DiscoreryApplication>(*args)
}
