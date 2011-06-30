(ns com.example.create-field
  (:import (com.vaadin.ui Window TextField Label Button))
  )

(defn create-fields [window]
  (.addComponent window (Label. "First Name"))
  (let [first-name (TextField. )]
    (.addComponent window first-name)
    )
  (let [submit-button (Button. "Submit")]
    (.addComponent window submit-button)
    )
  )