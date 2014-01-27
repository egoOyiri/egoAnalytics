(defproject ego/ego-analytics "0.1.0-SNAPSHOT"
  :description "Analytics Module using Incanter through Clojure"
  :dependencies [
     [org.clojure/clojure "1.5.1"]
		 [org.clojure/core.match "0.2.1"]
     [org.clojure/data.json "0.2.2"]
		 [com.typesafe.akka/akka-actor_2.11.0-M7 "2.2.3"]
     [org.scala-lang.modules/scala-async_2.10 "0.9.0-M4"]
     [incanter/incanter-core "1.5.4"]
     [incanter/incanter-io "1.5.4"]
     [incanter/incanter-charts "1.5.4"]
     [incanter/incanter-mongodb "1.5.4"]
     [incanter/incanter-pdf "1.5.4"]
     [incanter/incanter-latex "1.5.4"]
     [incanter/incanter-excel "1.5.4"]
     [incanter/incanter-sql "1.5.4"]
     [incanter/incanter-zoo "1.5.4"]
     [clj-time "0.6.0"]
     [swingrepl "1.3.0"
      :exclusions [org.clojure/clojure
                   org.clojure/clojure-contrib]]
     [jline "0.9.94"]
   ]
  :url "https://github.com/egoOyiri/egoAnalytics"
  :license {:name "Eclipse Public License"
	    :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ritz "0.7.0" :exclusions [org.clojure/clojure]]]
  :profiles {:dev {:resource-paths ["data"]}
             :debug {:debug true}
             }
  :repl-options {:init-ns btc
                 :init (do
                         (set! *print-length* 500)
                         (use 'clojure.repl))
                 }
  :jvm-opts ["-Xmx1g"])
