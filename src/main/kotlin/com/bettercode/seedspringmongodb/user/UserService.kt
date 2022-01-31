package com.bettercode.seedspringmongodb.user

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class UserService(
    private val userRepository: UserRepository,
) {
    fun createUser(user: User): Mono<UserCreatedResponse> =
        userRepository.save(user).map { UserCreatedResponse(it.id!!) }

    fun findAllUsers(): Flux<User> =
        userRepository.findAll()
}
