package com.bettercode.seedspringmongodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@SpringBootApplication
@EnableReactiveMongoRepositories
class SeedSpringMongodbApplication

fun main(args: Array<String>) {
	runApplication<SeedSpringMongodbApplication>(*args)
}
