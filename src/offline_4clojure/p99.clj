;; Product Digits - Easy
;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;; tags - math:seqs
;; restricted - 
(ns offline-4clojure.p99
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ 1 1) [1])
(= (__ 99 9) [8 9 1])
(= (__ 999 99) [9 8 9 0 1])
))
