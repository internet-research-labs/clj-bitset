(defproject bitset "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "UNLICENSE" :url "http://unlicense.org/"}

  ;; Dependencies
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :dev-dependencies [[junit/junit "4.11"]]

  ;; Source
  :source-paths   ["src/main/clj"]
  :test-paths     ["src/test/clj"]
  :resource-paths ["src/main/resources"]
  :java-source-paths ["src/main/java" "src/test/java"]

  ;; Compilation stuff
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options" "-Xlint:unchecked" "-XDignore.symbol.file"]
  :pom-location  "target"
  :target-path   "target"

  ;; Plugsin
  :junit ["src/test/java"]
  :plugins [[venantius/ultra "0.1.9"]
            [lein-environ "1.0.0"]
            [lein-junit "1.1.8"]]
  :profiles {:dev {:dependencies [[junit/junit "4.11"]]}}

  :main bitset.core)
