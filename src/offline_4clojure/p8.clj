;; Intro to Sets - Elementary
;; Sets are collections of unique values.
;; tags - 
;; restricted - 
(ns offline-4clojure.p8
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (set '(:a :a :b :c :c :c :c :d :d)))
(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
))
