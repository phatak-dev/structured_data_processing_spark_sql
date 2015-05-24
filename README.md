This repository contains example code and sample data for *Structured data analysis with Spark SQL* session.
Follow the below steps to clone code and setup your machine.


## Prerequisites

* Java
* Maven 3


## 2. Getting code

           git clone https://github.com/phatak-dev/structured_data_processing_spark_sql


## 3. Build

        mvn clean install

### 4. Testing

then run the following command from code directory

     java -cp target/spark-sql-examples.jar com.madhukaraphatak.spark.sql.sqlquery.QueryCsv local src/main/resources/sales.csv


## 5. Loading into an IDE

You can run all the examples from terminal. If you want to run from the IDE, follow the below steps


* IDEA 14

 Install [scala](https://plugins.jetbrains.com/plugin/?id=1347) plugin. Once plugin is loaded you can load it as [maven
 project](https://www.jetbrains.com/idea/help/importing-project-from-maven-model.html).


## 6. Up to date

Please pull before coming to the session to get the latest code.