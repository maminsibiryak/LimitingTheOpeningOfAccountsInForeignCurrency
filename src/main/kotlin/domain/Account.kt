package domain

import java.io.Serializable

data class Account(val name: String) : Serializable {
    var currency: Currency = Currency.RUB
    var type: Int = 0
    var group: Int = 0
    override fun toString(): String {
        return "Account(name='$name', currency=$currency, type=$type, group=$group)"
    }
}