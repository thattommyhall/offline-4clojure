;; Penultimate Element - Easy
;; Write a function which returns the second to last element from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p20
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ (list 1 2 3 4 5)) 4)
(= (__ ["a" "b" "c"]) "b")
(= (__ [[1 2] [3 4]]) [1 2])
))
