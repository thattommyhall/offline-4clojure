;; Pascal's Trapezoid - Easy
;; Write a function that, for any given input vector of numbers, returns an infinite lazy sequence of vectors, where each next one is constructed from the previous following the rules used in <a href="http://en.wikipedia.org/wiki/Pascal's_triangle">Pascal's Triangle</a>. For example, for [3 1 2], the next row is [3 4 3 2].
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p147
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (second (__ [2 3 2])) [2 5 5 2])
(= (take 5 (__ [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])
(= (take 2 (__ [3 1 2])) [[3 1 2] [3 4 3 2]])
(= (take 100 (__ [2 4 2])) (rest (take 101 (__ [2 2]))))
))
