(defproject clojure-vaadin-appV1 "1.0.0-SNAPSHOT"
  :description "clojure vaadin app"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [com.vaadin/vaadin "6.6.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [karras "0.6.0" :exclusions [org.clojure.contrib/core org.clojure/clojure-contrib]]]
  :dev-dependencies [[uk.org.alienscience/leiningen-war "0.0.1"]
                     [swank-clojure "1.3.0" :exclusions [org.clojure/clojure]]]
  :aot[com.example.vapp
       com.example.vaadin-servlet]
  :war {:name "clojure-vaadin.war"})
