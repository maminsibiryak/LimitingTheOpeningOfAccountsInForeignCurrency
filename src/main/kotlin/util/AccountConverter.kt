package util

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import domain.Account
import java.io.File
import java.io.FileNotFoundException


object AccountConverter {
    private val gson = Gson()
    fun convertAccountFromJson(): List<Account> {
        //не работает для задачи текущей
        val file = this::class.java.getResourceAsStream("/accounts/accounts.json")?.bufferedReader()?.readLines()
            ?: throw FileNotFoundException("Файл не найден")

        //работает, но нужно решить вопрос с чтением их resources
        //решение - получить ресурсы по имени файла и путь к нему через .path
        println("Получаем данные о счетах...")
        val path = this.javaClass.classLoader.getResource("accounts/accounts.json")?.path
            ?: throw FileNotFoundException("Файл не найден")
        val inputFile = File(path).inputStream().readBytes().toString(Charsets.UTF_8)
        val listOfMyClassObject = object : TypeToken<List<Account?>?>() {}.type
        println("Данные получены...")
        return gson.fromJson(inputFile, listOfMyClassObject)
    }
}