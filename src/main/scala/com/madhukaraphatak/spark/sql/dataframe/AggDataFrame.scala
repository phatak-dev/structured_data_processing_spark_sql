package com.madhukaraphatak.spark.sql.dataframe

import org.apache.spark.SparkContext

/**
 * Aggregate using DataFrame API
 */
object AggDataFrame {

  def main(args: Array[String]) {

    val sc = new SparkContext(args(0), "Csv loading example")
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val df = sqlContext.load("com.databricks.spark.csv", Map("path" -> args(1), "header" -> "true"))
    val countDF = df.agg(("*", "count"))
    println(countDF.collectAsList())
  }

}
