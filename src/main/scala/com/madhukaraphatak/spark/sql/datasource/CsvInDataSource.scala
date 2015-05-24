package com.madhukaraphatak.spark.sql.datasource

import org.apache.spark.SparkContext

/**
 * Loading csv using data source API
 */
object CsvInDataSource {
  def main(args: Array[String]) {

    val sc = new SparkContext(args(0), "Csv loading example")
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val df = sqlContext.load("com.databricks.spark.csv", Map("path" -> args(1), "header" -> "true"))
    println(df.schema.fieldNames.toList)
  }

}
