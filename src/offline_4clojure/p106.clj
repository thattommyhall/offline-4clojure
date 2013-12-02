;; Number Maze - Hard
;; Given a pair of numbers, the start and end point, find a path between the two using only three possible operations:<ul>
;;<li>double</li>
;;<li>halve (odd numbers cannot be halved)</li>
;;<li>add 2</li></ul>
;;
;;Find the shortest path through the "maze". Because there are multiple shortest paths, you must return the length of the shortest path, not the path itself.
;; tags - numbers
;; restricted - 
(ns offline-4clojure.p106
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 1 (__ 1 1))  ; 1
(= 3 (__ 3 12)) ; 3 6 12
(= 3 (__ 12 3)) ; 12 6 3
(= 3 (__ 5 9))  ; 5 7 9
(= 9 (__ 9 2))  ; 9 18 20 10 12 6 8 4 2
(= 5 (__ 9 12)) ; 9 11 22 24 12

))
