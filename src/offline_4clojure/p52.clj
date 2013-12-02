;; Intro to Destructuring - Easy
;; Let bindings and function parameter lists support destructuring.
;; tags - destructuring
;; restricted - 
(ns offline-4clojure.p52
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= [2 4] (let [[a b c d e f g] (range)] __))
))
