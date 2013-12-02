;; Filter Perfect Squares - Medium
;; Given a string of comma separated integers, write a function which returns a new comma separated string that only contains the numbers which are perfect squares.
;; tags - 
;; restricted - 
(ns offline-4clojure.p74
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ "4,5,6,7,8,9") "4,9")
(= (__ "15,16,25,36,37") "16,25,36")
))
