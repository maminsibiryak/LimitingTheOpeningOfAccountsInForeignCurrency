package api

import domain.CurrencyParams

interface ParamsService {
    fun getStringParams():List<CurrencyParams>
}