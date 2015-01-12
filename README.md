egoAnalytics
============

A Clojure library designed to provide Exchange Rates for African based countries, along with Analytics Data and View to allow the conversion of Virtual Currency to Local Currencies.

# Technology Used:
A JVM based Analytics tool is required, only Incanter (written in Clojure) seems to match the R Project.
Incanter allows the data extract and writting from Files and URLs, dumping results as CSV files and diplayed by D3.JS Javascripts is the ultimate goal.
Akka Server along with Spray library will provide REST/APIs and Web Content. 


## Usage

This project uses Eclipse Counterclockwise plugin http://doc.ccw-ide.org/documentation.html
To run the sample, open up core.clj, press [CMD][ALT][S] MacOSX and [CTL][ALT][S] in Windows

At the REPL Prompt:

> (let [a (:akka/actor #(println "Received " %))]
        (:akka! a "hello")) [Ctrl+Enter]

# this project also uses Apache Spark to match  R and Incanter samples

To run the install:

> bootstrap/install.sh

HDFS_HOME=~/bin/local/bigdata/hadoop

### NameNode Daemons
Starting the services

$ $HDFS_HOME/sbin/start-dfs.sh

Note: On MacOS, make sure SSH is started. Control Panel/Sharing/Remote Login [ON]

 Checking Services are running

$ jps

13049 NameNode (HDFS Name Node) -- Make sure this is running
13241 DataNode (HDFS Data Node)
22752 ResourceManager (Yarn Resource)
22894 NodeManager (Yarn Node)

---

Monitoring DFS Health

Browsing the File System's health

http://fvisqa-lnx:50070


Yarn Daemons
Start ResourceManager daemon and NodeManager daemon:

$ $HDFS_HOME/sbin/start-yarn.sh

When you're done, stop the daemons with:

$ $HDFS_HOME/sbin/stop-yarn.sh

Monitoring Resource Manager

If you want to look at the running jobs or already executed (Jobwatch Equivalent)

http://fvisqa-lnx:8088
Hadoop Distributed File System (Hadoop DFS) handling
Create and Mount a new Hadoop DFS

$ hdfs namenode -format


Create a directory in Hadoop DFS

Create the user directory along with the owner directory

$ hdfs dfs -mkdir -p /user/${USER}

## License

Copyleft © 2014 EgoOyiri [AfricaCoin]

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
