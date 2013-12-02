;; Longest Increasing Sub-Seq - Hard
;; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p53
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])
(= (__ [5 6 1 3 2 7]) [5 6])
(= (__ [2 3 3 4 5]) [3 4 5])
(= (__ [7 6 5 4]) [])
))
