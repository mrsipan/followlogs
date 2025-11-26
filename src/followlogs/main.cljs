(ns followlogs.main
  (:require ;[squint.string :as squint.string]
   ["mri$default" :as mri]))

(def Settings
  (mri js/scriptArgs
       (clj->js {:alias {:p "port" :v "verbose"}
                 :default {:port 8080 :verbose false}})))

(println (.-port Settings))
(println (.-verbose Settings))
(println (.-_ Settings))
