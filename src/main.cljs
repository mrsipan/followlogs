(ns followlogs
  (:require
            [squint.string :as squint.string]
            ["yargs$default" :as yargs]
            ["yargs/helpers" :refer [hideBin]]
            ))

(def argv
  (-> (yargs (hideBin js/process.argv))
      (.usage "Usage: $0 [options]")
      (.option "port" #js {:alias "p"
                           :describe "Port number"
                           :type "number"
                           :default 8080})
      (.option "verbose" #js {:alias "v"
                              :describe "Enable verbose mode"
                              :type "boolean"})
      (.help)
      (.parse)
      ))

;; Example usage
(println "Port:" (.-port argv))

(when (.-verbose argv)
  (println "Verbose mode enabled"))

