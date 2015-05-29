package com.madhukaraphatak.spark.sql.parquet

import org.apache.spark.SparkContext

/**
  * Aggregate using DataFrame API in Parquet file
  */
object AggParquet {

   def main(args: Array[String]) {

     val sc = new SparkContext(args(0), "Parquet loading example")
     val sqlContext = new org.apache.spark.sql.SQLContext(sc)
     val df = sqlContext.load("org.apache.spark.sql.parquet", Map("path" -> args(1)))
     val countDF = df.agg(("transactionId", "count"))
     println(countDF.collectAsList())
   }
 }
