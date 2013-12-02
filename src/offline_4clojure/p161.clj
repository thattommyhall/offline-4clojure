;; Subset and Superset - Elementary
;; Set A is a subset of set B, or equivalently B is a superset of A, if A is "contained" inside B. A and B may coincide.
;; tags - set-theory
;; restricted - 
(ns offline-4clojure.p161
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(clojure.set/superset? __ #{2})
(clojure.set/subset? #{1} __)
(clojure.set/superset? __ #{1 2})
(clojure.set/subset? #{1 2} __)
))
