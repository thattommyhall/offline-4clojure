;; Count a Sequence - Easy
;; Write a function which returns the total number of elements in a sequence.
;; tags - seqs:core-functions
;; restricted - count
(ns offline-4clojure.p22
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ '(1 2 3 3 1)) 5)
(= (__ "Hello World") 11)
(= (__ [[1 2] [3 4] [5 6]]) 3)
(= (__ '(13)) 1)
(= (__ '(:a :b :c)) 3)
))
