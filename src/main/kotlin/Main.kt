import service.ParamsServiceImpl
import util.AccountConverter


fun main(args: Array<String>) {
    val paramsService = ParamsServiceImpl()
    val output = AccountConverter.convertAccountFromJson()

    val listCurrencyParams = paramsService.getStringParams()

    listCurrencyParams.forEach {
        val (currency, _, count) = it.currency.split(";")
        val filterAccountByCurrency = output.filter { el -> el.currency.name == currency }
        if (count.toInt() > filterAccountByCurrency.size) {
            println("можно открывать")
        } else {
            println("Данный вклад нельзя открывать больше $count раз в валюте $currency")
        }
    }

}