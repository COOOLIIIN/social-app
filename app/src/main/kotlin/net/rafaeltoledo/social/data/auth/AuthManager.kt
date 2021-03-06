package net.rafaeltoledo.social.data.auth

import net.rafaeltoledo.social.data.User

interface AuthManager {

    suspend fun socialSignIn(token: String, provider: SocialProvider): User

    fun isUserLoggedIn(): Boolean
}

enum class SocialProvider {
    GOOGLE
}
