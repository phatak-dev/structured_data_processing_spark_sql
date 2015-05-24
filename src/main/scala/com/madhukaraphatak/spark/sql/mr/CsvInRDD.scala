package com.madhukaraphatak.spark.sql.mr


import org.apache.spark.SparkContext

/**
 * Parsing data in CSV
 */
object CsvInRDD {

  def main(args: Array[String]) {

    val sc  = new SparkContext(args(0), "csv in rdd")
    val salesRDD  = sc.textFile(args(1))
    val firstLine = salesRDD.first()
    val otherLines = salesRDD.filter(row => row != firstLine)
    val sales = otherLines.map(_.split(",")).map(p=> Sales(p(0).trim.toInt,
      p(1).trim.toInt, p(2).trim.toInt, p(3).trim.toDouble))
    println(sales.map(value => value.customerId).collect().toList)
  }

}
