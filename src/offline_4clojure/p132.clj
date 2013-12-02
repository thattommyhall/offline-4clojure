;; Insert between two items - Medium
;; Write a function that takes a two-argument predicate, a value, and a collection; and returns a new collection where the <code>value</code> is inserted between every two items that satisfy the predicate.
;; tags - seqs:core-functions
;; restricted - 
(ns offline-4clojure.p132
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= '(1 :less 6 :less 7 4 3) (__ < :less [1 6 7 4 3]))
(= '(2) (__ > :more [2]))
(= [0 1 :x 2 :x 3 :x 4]  (__ #(and (pos? %) (< % %2)) :x (range 5)))
(empty? (__ > :more ()))
(= [0 1 :same 1 2 3 :same 5 8 13 :same 21]
   (take 12 (->> [0 1]
                 (iterate (fn [[a b]] [b (+ a b)]))
                 (map first) ; fibonacci numbers
                 (__ (fn [a b] ; both even or both odd
                       (= (mod a 2) (mod b 2)))
                     :same))))
))
