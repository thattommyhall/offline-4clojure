;; Making Data Dance - Hard
;; Write a function that takes a variable number of integer arguments.  If the output is coerced into a string, it should return a comma (and space) separated list of the inputs sorted smallest to largest.  If the output is coerced into a sequence, it should return a seq of unique input elements in the same order as they were entered.
;; tags - types
;; restricted - proxy
(ns offline-4clojure.p113
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= "1, 2, 3" (str (__ 2 1 3)))
(= '(2 1 3) (seq (__ 2 1 3)))
(= '(2 1 3) (seq (__ 2 1 3 3 1 2)))
(= '(1) (seq (apply __ (repeat 5 1))))
(= "1, 1, 1, 1, 1" (str (apply __ (repeat 5 1))))
(and (= nil (seq (__)))
     (=  "" (str (__))))
))
