;; Euler's Totient Function - Medium
;; Two numbers are coprime if their greatest common divisor equals 1.  Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x.  The special case f(1) equals 1.  Write a function which calculates Euler's totient function.
;; tags - 
;; restricted - 
(ns offline-4clojure.p75
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ 1) 1)
(= (__ 10) (count '(1 3 7 9)) 4)
(= (__ 40) 16)
(= (__ 99) 60)
))
