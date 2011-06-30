(ns com.example.vapp
  (:gen-class
    :extends com.vaadin.Application
    :name com.example.VApp
    :init cjinit)
  (:use [com.example.create-field])
  (:import (com.vaadin.ui Window TextField ))
  )

(defn -cjinit []
  [[] (ref {})])



(defn -init [this]
  (let [window (Window. "clojure vaadin application")]
    (.setMainWindow this window)
    (.setTheme window "runo")
    (create-fields window)
    )
  )

