package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

// This is a simple Spring Boot application
// Rename this class to match your project name
@SpringBootApplication
class HelloWorld

fun main(args: Array<String>) {
    SpringApplicationBuilder(HelloWorld::class.java)
        .run(*args)
}
