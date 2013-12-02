;; Oscilrate - Medium
;; Write an oscillating iterate: a function that takes an initial value and a variable number of functions. It should return a lazy sequence of the functions applied to the value in order, restarting from the first function after it hits the end.
;; tags - sequences
;; restricted - 
(ns offline-4clojure.p144
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (take 3 (__ 3.14 int double)) [3.14 3 3.0])
(= (take 5 (__ 3 #(- % 3) #(+ 5 %))) [3 0 5 2 7])
(= (take 12 (__ 0 inc dec inc dec inc)) [0 1 0 1 0 1 2 1 2 1 2 3])

))
