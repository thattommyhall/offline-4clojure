;; Re-implement Map - Easy
;; <p>Map is one of the core elements of a functional programming language. Given a function <code>f</code> and an input sequence <code>s</code>, return a lazy sequence of <code>(f x)</code> for each element <code>x</code> in <code>s</code>.
;; tags - core-seqs
;; restricted - map:map-indexed:mapcat:for
(ns offline-4clojure.p118
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= [3 4 5 6 7]
   (__ inc [2 3 4 5 6]))
(= (repeat 10 nil)
   (__ (fn [_] nil) (range 10)))
(= [1000000 1000001]
   (->> (__ inc (range))
        (drop (dec 1000000))
        (take 2)))
))
