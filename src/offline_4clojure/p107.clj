;; Simple closures - Easy
;; <p>Lexical scope and first-class functions are two of the most basic building blocks of a functional language like Clojure. When you combine the two together, you get something very powerful called <strong>lexical closures</strong>. With these, you can exercise a great deal of control over the lifetime of your local bindings, saving their values for use later, long after the code you're running now has finished.</p>
;;
;;<p>It can be hard to follow in the abstract, so let's build a simple closure. Given a positive integer <i>n</i>, return a function <code>(f x)</code> which computes <i>x<sup>n</sup></i>. Observe that the effect of this is to preserve the value of <i>n</i> for use outside the scope in which it is defined.</p>
;; tags - higher-order-functions:math
;; restricted - 
(ns offline-4clojure.p107
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 256 ((__ 2) 16),
       ((__ 8) 2))
(= [1 8 27 64] (map (__ 3) [1 2 3 4]))
(= [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4]))
))
