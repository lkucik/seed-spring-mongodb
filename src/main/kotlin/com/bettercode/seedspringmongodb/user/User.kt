package com.bettercode.seedspringmongodb.user

import java.time.Instant

data class User(
    val name: Personal,
    val birth: Instant,
    val death: Instant? = null,
    val contributions: List<String> = emptyList(),
    val views: Int = 0,

    val id: String? = null,
)

data class Personal(
    val first: String,
    val last: String,
)

data class UserCreatedResponse(
    val id: String,
)
