package service

import api.AccountService
import domain.Account

class AccountServiceImpl : AccountService {
    override fun getAllAccounts(): List<Account> {
        TODO("Not yet implemented")
    }

    override fun getAccount(type: Int, group: Int): Account? {
        TODO("Not yet implemented")
    }
}