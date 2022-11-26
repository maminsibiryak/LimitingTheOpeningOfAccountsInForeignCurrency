package api

import domain.Account

interface AccountService {
    fun getAllAccounts(): List<Account>
    fun getAccount(type: Int, group: Int): Account?
}