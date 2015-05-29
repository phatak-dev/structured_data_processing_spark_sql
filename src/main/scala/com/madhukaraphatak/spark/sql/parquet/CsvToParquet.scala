package com.madhukaraphatak.spark.sql.parquet

import org.apache.spark.SparkContext
import org.apache.spark.sql.SaveMode

/**
 * Converting CSV to Parquet
 */
object CsvToParquet {

  def main(args: Array[String]) {

    val sc = new SparkContext(args(0), "Csv loading example")
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val df = sqlContext.load("com.databricks.spark.csv", Map("path" -> args(1), "header" -> "true"))
    df.save("org.apache.spark.sql.parquet",SaveMode.ErrorIfExists, Map("path" -> args(2)))
  }

}
