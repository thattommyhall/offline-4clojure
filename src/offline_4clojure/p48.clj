;; Intro to some - Easy
;; The some function takes a predicate function and a collection.  It returns the first logical true value of (predicate x) where x is an item in the collection.
;; tags - 
;; restricted - 
(ns offline-4clojure.p48
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (some #{2 7 6} [5 6 7 8]))
(= __ (some #(when (even? %) %) [5 6 7 8]))
))
