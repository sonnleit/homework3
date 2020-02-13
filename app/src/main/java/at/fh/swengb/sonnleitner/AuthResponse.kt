package at.fh.swengb.sonnleitner

import com.squareup.moshi.JsonClass

@JsonClass (generateAdapter = true)
class AuthResponse(val token: String) {
}