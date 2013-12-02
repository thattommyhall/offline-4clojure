;; Contain Yourself - Easy
;; The contains? function checks if a KEY is present in a given collection.  This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.
;; tags - 
;; restricted - 
(ns offline-4clojure.p47
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(contains? #{4 5 6} __)
(contains? [1 1 1 1 1] __)
(contains? {4 :a 2 :b} __)
(not (contains? '(1 2 4) __))
))
