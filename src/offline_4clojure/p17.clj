;; Sequences: map - Elementary
;; The map function takes two arguments: a function (f) and a sequence (s).  Map returns a new sequence consisting of the result of applying f to each item of s.  Do not confuse the map function with the map data structure.
;; tags - 
;; restricted - 
(ns offline-4clojure.p17
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (map #(+ % 5) '(1 2 3)))
))
