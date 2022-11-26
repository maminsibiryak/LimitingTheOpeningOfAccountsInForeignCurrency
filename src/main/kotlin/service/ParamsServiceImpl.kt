package service

import api.ParamsService
import domain.CurrencyParams

class ParamsServiceImpl : ParamsService {
    override fun getStringParams(): List<CurrencyParams> {
        return listOf(CurrencyParams("RUB;61;300"), CurrencyParams("USD;61;3"))
    }
}