;; Triangle Minimal Path - Hard
;; Write a function which calculates the sum of the minimal path through a triangle.  The triangle is represented as a collection of vectors.  The path should start at the top of the triangle and move to an adjacent number on the next row until the bottom of the triangle is reached.
;; tags - graph-theory
;; restricted - 
(ns offline-4clojure.p79
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 7 (__ '([1]
          [2 4]
         [5 1 4]
        [2 3 4 5]))) ; 1->2->1->3
(= 20 (__ '([3]
           [2 4]
          [1 9 3]
         [9 9 2 4]
        [4 6 6 7 8]
       [5 7 3 5 1 4]))) ; 3->4->3->2->7->1
))
