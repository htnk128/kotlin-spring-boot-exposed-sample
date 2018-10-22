package com.example.kotlin.spring.boot.exposed.sample.domain.model.account

interface AccountRepository {

    fun find(accountId: AccountIdentity): Account?

    fun findAll(): List<Account>

    fun create(account: Account)

    fun update(account: Account): Int
}
