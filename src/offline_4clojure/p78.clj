;; Reimplement Trampoline - Medium
;; Reimplement the function described in <a href="76"> "Intro to Trampoline"</a>.
;; tags - core-functions
;; restricted - trampoline
(ns offline-4clojure.p78
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (letfn [(triple [x] #(sub-two (* 3 x)))
          (sub-two [x] #(stop?(- x 2)))
          (stop? [x] (if (> x 50) x #(triple x)))]
    (__ triple 2))
  82)
(= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
    (map (partial __ my-even?) (range 6)))
  [true false true false true false])
))
