package com.bettercode.seedspringmongodb.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class UserController(
    private val userService: UserService,
) {

    @PostMapping("/users")
    fun createUser(
        @RequestBody user: User,
    ): Mono<UserCreatedResponse> = userService.createUser(user)

    @GetMapping("/users")
    fun findAllUsers(): Flux<User> = userService.findAllUsers()
}
