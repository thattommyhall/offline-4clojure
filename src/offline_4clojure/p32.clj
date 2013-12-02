;; Duplicate a Sequence - Easy
;; Write a function which duplicates each element of a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p32
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ [1 2 3]) '(1 1 2 2 3 3))
(= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
(= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
))
