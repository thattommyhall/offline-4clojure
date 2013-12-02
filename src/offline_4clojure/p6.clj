;; Intro to Vectors - Elementary
;; Vectors can be constructed several ways.  You can compare them with lists.
;; tags - 
;; restricted - 
(ns offline-4clojure.p6
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
))
