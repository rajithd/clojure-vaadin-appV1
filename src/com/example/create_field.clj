(ns com.example.create-field
  (:use [com.example.repo.mongo-connection])
  (:import (com.vaadin.ui Window TextField Label Button)))

(defn create-fields [window]
  (.addComponent window (Label. "First Name"))
  (let [first-name (TextField. )]
    (.addComponent window first-name)
  (let [submit-button (Button. "Submit")]
    (.addComponent window submit-button)
    (.addListener submit-button (proxy [com.vaadin.ui.Button$ClickListener] []
      (buttonClick [event]
        (insert-name (.getValue first-name))))))))