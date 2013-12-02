;; Last Element - Easy
;; Write a function which returns the last element in a sequence.
;; tags - seqs:core-functions
;; restricted - last
(ns offline-4clojure.p19
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ [1 2 3 4 5]) 5)
(= (__ '(5 4 3)) 3)
(= (__ ["b" "c" "d"]) "d")
))
