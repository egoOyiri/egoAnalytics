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


## License

Copyleft © 2014 EgoOyiri [AfricaCoin]

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
