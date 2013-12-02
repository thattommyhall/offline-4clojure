;; Pack a Sequence - Easy
;; Write a function which packs consecutive duplicates into sub-lists.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p31
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
(= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
(= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))
))
