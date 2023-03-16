package com.example.crypto_wallet_server.repositories

import com.example.crypto_wallet_server.models.Wallet
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WalletRepository: JpaRepository<Wallet, Long> {
    fun findByAddress(address: String): Wallet?
}