package com.example.crypto_wallet_server.controllers

import com.example.crypto_wallet_server.models.Wallet
import com.example.crypto_wallet_server.repositories.WalletRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WalletController {
    @Autowired
    private lateinit var walletRepository: WalletRepository

    @PostMapping("/insertWallet/")
    fun insertWallet(@RequestBody wallet: Wallet):Wallet? {
        val walletDB = walletRepository.findByAddress(wallet.address)
        return if(walletDB == null) walletRepository.save(wallet) else null
    }
}