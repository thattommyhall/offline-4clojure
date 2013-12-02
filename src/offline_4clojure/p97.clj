;; Pascal's Triangle - Easy
;; <a href="http://en.wikipedia.org/wiki/Pascal%27s_triangle">Pascal's triangle</a> is a triangle of numbers computed using the following rules:<br/></br>- The first row is 1.</br>- Each successive row is computed by adding together adjacent numbers in the row above, and adding a 1 to the beginning and end of the row.<br/><br/>Write a function which returns the nth row of Pascal's Triangle.
;;
;;
;;
;; tags - 
;; restricted - 
(ns offline-4clojure.p97
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ 1) [1])
(= (map __ (range 1 6))
   [     [1]
        [1 1]
       [1 2 1]
      [1 3 3 1]
     [1 4 6 4 1]])
(= (__ 11)
   [1 10 45 120 210 252 210 120 45 10 1])
))
