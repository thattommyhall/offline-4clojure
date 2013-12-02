;; Read a binary number - Easy
;; Convert a binary number, provided in the form of a string, to its numerical value.
;; tags - 
;; restricted - 
(ns offline-4clojure.p122
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 0     (__ "0"))
(= 7     (__ "111"))
(= 8     (__ "1000"))
(= 9     (__ "1001"))
(= 255   (__ "11111111"))
(= 1365  (__ "10101010101"))
(= 65535 (__ "1111111111111111"))
))
