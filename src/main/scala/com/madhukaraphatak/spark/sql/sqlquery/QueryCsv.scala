package com.madhukaraphatak.spark.sql.sqlquery

import org.apache.spark.SparkContext

/**
  * Querying csv using SQL
  */
object QueryCsv {
   def main(args: Array[String]) {

     val sc = new SparkContext(args(0), "Csv loading example")
     val sqlContext = new org.apache.spark.sql.SQLContext(sc)
     val df = sqlContext.load("com.databricks.spark.csv", Map("path" -> args(1), "header" -> "true"))
     df.registerTempTable("sales")

     val countDF = sqlContext.sql("select count(*) from sales")
     println(countDF.collect().toList)

   }

 }
