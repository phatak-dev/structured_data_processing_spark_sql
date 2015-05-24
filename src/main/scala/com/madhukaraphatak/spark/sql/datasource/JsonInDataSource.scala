package com.madhukaraphatak.spark.sql.datasource

import org.apache.spark.SparkContext

/**
 * Loading sales json using DataFrame API
 */
object JsonInDataSource {
  def main(args: Array[String]) {

    val sc = new SparkContext(args(0), "Json loading example")
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val df = sqlContext.load("org.apache.spark.sql.json", Map("path" -> args(1)))
    println(df.schema.fieldNames.toList)
  }

}
