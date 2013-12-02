;; Decurry - Medium
;; Write a function that accepts a curried function of unknown arity <i>n</i>.  Return an equivalent function of <i>n</i> arguments.
;;<br/>
;;You may wish to read <a href="http://en.wikipedia.org/wiki/Currying">this</a>.
;; tags - partial-functions
;; restricted - 
(ns offline-4clojure.p158
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 10 ((__ (fn [a]
             (fn [b]
               (fn [c]
                 (fn [d]
                   (+ a b c d))))))
       1 2 3 4))
(= 24 ((__ (fn [a]
             (fn [b]
               (fn [c]
                 (fn [d]
                   (* a b c d))))))
       1 2 3 4))
(= 25 ((__ (fn [a]
             (fn [b]
               (* a b))))
       5 5))

))
