;; Prime Sandwich - Medium
;; A <a href="http://en.wikipedia.org/wiki/Balanced_prime">balanced prime</a> is a prime number which is also the mean of the primes directly before and after it in the sequence of valid primes.  Create a function which takes an integer n, and returns true iff it is a balanced prime.
;; tags - math
;; restricted - 
(ns offline-4clojure.p116
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= false (__ 4))
(= true (__ 563))
(= 1103 (nth (filter __ (range)) 15))
))
