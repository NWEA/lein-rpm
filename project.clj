(defproject lein-rpm "0.0.7-NWEA"
  :description "Create an RPM"
  :dependencies [[org.codehaus.mojo/rpm-maven-plugin "2.1-alpha-1"]
                 [org.clojure/java.data "0.1.1"]]
  :eval-in-leiningen true
  :plugins [[lein-pprint "1.1.1"]])
