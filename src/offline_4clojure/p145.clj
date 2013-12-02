;; For the win - Elementary
;; Clojure's <a href="http://clojuredocs.org/clojure_core/clojure.core/for">for</a> macro is a tremendously versatile mechanism for producing a sequence based on some other sequence(s). It can take some time to understand how to use it properly, but that investment will be paid back with clear, concise sequence-wrangling later. With that in mind, read over these <code>for</code> expressions and try to see how each of them produces the same result.
;; tags - core-functions:seqs
;; restricted - 
(ns offline-4clojure.p145
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= __ (for [x (range 40)
            :when (= 1 (rem x 4))]
        x))
(= __ (for [x (iterate #(+ 4 %) 0)
            :let [z (inc x)]
            :while (< z 40)]
        z))
(= __ (for [[x y] (partition 2 (range 20))]
        (+ x y)))
))
