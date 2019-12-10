package htnk128.kotlin.spring.boot.ddd.sample.customer.application.exception

import htnk128.kotlin.spring.boot.ddd.sample.customer.domain.model.customer.Customer
import htnk128.kotlin.spring.boot.ddd.sample.customer.domain.model.customer.CustomerId
import htnk128.kotlin.spring.boot.ddd.sample.shared.application.exception.NotFoundException

/**
 * 顧客([Customer])のドメインモデルが存在しない場合に発生する例外。
 */
class CustomerNotFoundException(
    customerId: CustomerId,
    message: String = "customer not found. (customerId=$customerId)",
    cause: Throwable? = null
) : NotFoundException(message = message, cause = cause)
