;; Logical falsity and truth - Elementary
;; In Clojure, only nil and false represent the values of logical falsity in conditional tests - anything else is logical truth.
;; tags - logic
;; restricted - 
(ns offline-4clojure.p162
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (if-not false 1 0))
(= __ (if-not nil 1 0))
(= __ (if true 1 0))
(= __ (if [] 1 0))
(= __ (if [0] 1 0))
(= __ (if 0 1 0))
(= __ (if 1 1 0))
))
