;; Sequences: filter - Elementary
;; The filter function takes two arguments: a predicate function (f) and a sequence (s).  Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
;; tags - 
;; restricted - 
(ns offline-4clojure.p18
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (filter #(> % 5) '(3 4 5 6 7)))
))
