;; Short Version
;; In the default package use the below libraries
(ns africa-coin.analytics
  (:require [clojure.set :as set]
            [clj-time.core :as time])
  (:use (incanter core zoo stats charts io latex)
        (clj-time [format :only (formatter formatters parse)]
          [coerce :only (to-long)])))

(defn dates-long
  "returns the dates as Unix long"
  [data]
  (let [ymd-formatter (formatters :year-month-day)
        dates-str	($ :Date data)]
    (map #(to-long (parse ymd-formatter %)) dates-str)))

(defn log-return
  "returns log returns following ln(Pt)-ln(Pt-1)
   This is mostly 2 operations to reach ln(1/Pt-1 / 1/Pt)   pt-1 = 97.51 and Pt = 88.05
   1) Roll Apply (/ (div 97.51) (div 88.05) where is the inverse
   2) Apply (log from 1)
       (def btc-div (zoo-apply #(apply - (div %)) 2 btc-zoo :Close))
       (def btc-r (zoo-apply #(apply log %) 1 btc-div :Close))
   3) Issue with zoo when row is null
  "
  [z coll]
  ;; A little bit complicated and spreading in multiple lines
  ;; would be better
  ($ [:not 0] :all (zoo-apply #(apply log %) 1 (zoo-apply #(apply / (div %)) 2 z coll) coll))
  )