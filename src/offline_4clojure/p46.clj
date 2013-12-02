;; Flipping out - Medium
;; Write a higher-order function which flips the order of the arguments of an input function.
;; tags - higher-order-functions
;; restricted - 
(ns offline-4clojure.p46
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 3 ((__ nth) 2 [1 2 3 4 5]))
(= true ((__ >) 7 8))
(= 4 ((__ quot) 2 8))
(= [1 2 3] ((__ take) [1 2 3 4 5] 3))
))
