(ns com.example.repo.mongo-connection
  (:use karras.core
        karras.collection
        karras.sugar))

(def my-collection (collection (connect) :informt :users))

(defn insert-name [first-name]
  (insert my-collection {:name first-name})
  )