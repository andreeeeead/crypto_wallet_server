package com.example.crypto_wallet_server.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Wallet(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?,
    val address: String,
    val isWallet: Boolean
)