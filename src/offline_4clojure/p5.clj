;; Lists: conj - Elementary
;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.
;; tags - 
;; restricted - 
(ns offline-4clojure.p5
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (conj '(2 3 4) 1))
(= __ (conj '(3 4) 2 1))
))
