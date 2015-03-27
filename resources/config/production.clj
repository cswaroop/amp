{:logging {:loggers [{:type :stdout :level :warn}
                     ;; {:type :remote :host "beast.local" :level :debug}
                     ;; {:type :file :file "caribou-logging.out" :level :warn}
                     ]}
 :database {:classname    "org.postgresql.Driver"
            :subprotocol  "postgresql"
            :host         "localhost"
            :database     "pictograph_production"
            :user         "postgres"
            :password     "postgres"}
 :controller {:namespace "pictograph.controllers" :reload :never}
 :cache-templates :always}
