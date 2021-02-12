package com.example.tema2

data class HeartRateEntry(val date: Long, val value: Int)

fun populateData(vararg dataPair: Pair<Long, Int>): List<HeartRateEntry> =
        dataPair.map { HeartRateEntry(it.first, it.second) }

val data = populateData(
        1612310400L to 76,
        1612310400L to 89,
        1612310400L to 44,
        1612224000L to 47,
        1612224000L to 115,
        1612224000L to 76,
        1612224000L to 87,
        1612137600L to 90,
        1612137600L to 167
)

var minVal = data.minWithOrNull(Comparator { a, b -> a.value.compareTo(b.value) })
var minVal1 = data.minByOrNull { it.value }
val average = data.sumByDouble { it.value.toDouble() }.div(data.count())
val biggerThan100 = data.filter { it.value > 100 }
val mapValuesGroupByDate = data.groupBy { it.date }.mapValues {
    it.value.map { pair -> pair.value }
} //  key=date, value = List of values measured in that date

var mapOfMaxPerDay = data.groupBy { it.date }
        .mapValues { it.value.map { pair -> pair.value }.maxOrNull() }



