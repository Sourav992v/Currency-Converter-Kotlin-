package com.sourav.currencyconverter.main

import com.sourav.currencyconverter.data.models.CurrencyResponse
import com.sourav.currencyconverter.util.Resource

interface MainRepository {


    suspend fun getRates(base: String): Resource<CurrencyResponse>
}