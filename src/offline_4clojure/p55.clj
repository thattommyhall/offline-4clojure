;; Count Occurrences - Medium
;; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
;; tags - seqs:core-functions
;; restricted - frequencies
(ns offline-4clojure.p55
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
(= (__ [:b :a :b :a :b]) {:a 2, :b 3})
(= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
))
