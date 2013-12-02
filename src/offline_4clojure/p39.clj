;; Interleave Two Seqs - Easy
;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;; tags - seqs:core-functions
;; restricted - interleave
(ns offline-4clojure.p39
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))
(= (__ [1 2] [3 4 5 6]) '(1 3 2 4))
(= (__ [1 2 3 4] [5]) [1 5])
(= (__ [30 20] [25 15]) [30 25 20 15])
))
