package com.madhukaraphatak.spark.sql.datasource

import org.apache.spark.SparkContext

import scala.util.Try

/**
 * Created by madhu on 23/5/15.
 */
object MixSources {

  def main(args: Array[String]) {

    val sc = new SparkContext(args(0), "Csv loading example")
    val sqlContext = new org.apache.spark.sql.SQLContext(sc)
    val path = args(1)
    val source = args(2)
    val header = Try(args(3)).getOrElse("true")
    val df = sqlContext.load(source, Map("path" -> args(1), "header" -> header))
    println(df.schema.fieldNames.toList)
  }

}
