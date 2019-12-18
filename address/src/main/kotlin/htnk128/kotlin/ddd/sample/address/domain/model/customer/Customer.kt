package htnk128.kotlin.ddd.sample.address.domain.model.customer

import htnk128.kotlin.ddd.sample.dddcore.domain.Entity

/**
 * 顧客のコンテキストマッピングを表現する。
 */
class Customer(
    val customerId: CustomerId
) : Entity<Customer> {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Customer
        return sameIdentityAs(other)
    }

    override fun hashCode(): Int = customerId.hashCode()

    override fun sameIdentityAs(other: Customer): Boolean = customerId == other.customerId
}
