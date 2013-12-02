;; Find the odd numbers - Easy
;; Write a function which returns only the odd numbers from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p25
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ #{1 2 3 4 5}) '(1 3 5))
(= (__ [4 2 1 6]) '(1))
(= (__ [2 2 4 6]) '())
(= (__ [1 1 1 3]) '(1 1 1 3))
))
