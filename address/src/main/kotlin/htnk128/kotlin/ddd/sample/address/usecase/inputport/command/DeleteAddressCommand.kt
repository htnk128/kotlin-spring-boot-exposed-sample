package htnk128.kotlin.ddd.sample.address.usecase.inputport.command

/**
 * 住所を削除する際のコマンド情報。
 */
data class DeleteAddressCommand(
    val addressId: String
)
