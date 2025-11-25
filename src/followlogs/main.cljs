(ns followlogs.main
  (:require ;[squint.string :as squint.string]
    ["mri$default" :as mri]
  ))

(def settings
  (mri js/scriptArgs
       (clj->js {:alias {:p "port", :v "verbose"},
            :default {:port 8080, :verbose false}}))
  )

(println (.-port settings))
(println (.-verbose settings))
(println (.-_ settings))
