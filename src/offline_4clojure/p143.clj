;; dot product - Easy
;; Create a function that computes the <a href="http://en.wikipedia.org/wiki/Dot_product#Definition">dot product</a> of two sequences. You may assume that the vectors will have the same length.
;; tags - seqs:math
;; restricted - 
(ns offline-4clojure.p143
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 0 (__ [0 1 0] [1 0 0]))
(= 3 (__ [1 1 1] [1 1 1]))
(= 32 (__ [1 2 3] [4 5 6]))
(= 256 (__ [2 5 6] [100 10 1]))
))
