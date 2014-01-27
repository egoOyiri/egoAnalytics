;; Short Version
;; In the default package use the below libraries
(ns africa-coin.core
  (:use (akka-clojure akka)
        (africa-coin analytics)
  )
  (:require [clojure.set :as set]
          [clj-time.core :as time])
  (:use (incanter core zoo stats charts io latex)
        (clj-time [format :only (formatter formatters parse)]
          [coerce :only (to-long)]))
)

(let [a (:akka/actor #(println "Received " %))]
        (:akka! a "hello"))

;; Define the Quandl MtGox BTC/USD
;; Fetch the data always in Ascending Order
(def url "http://www.quandl.com/api/v1/datasets/BITCOIN/MTGOXUSD.csv?&trim_start=2010-07-01&trim_end=2013-07-01&sort_order=asc")
(def btc (read-dataset url :header true))

;; Convert to Zoo object
(def btc-z (zoo btc :Date))
(def btc-r (log-return btc-z :Close))

