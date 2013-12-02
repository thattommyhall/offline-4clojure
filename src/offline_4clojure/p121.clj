;; Universal Computation Engine - Medium
;; 	 Given a mathematical formula in prefix notation, return a function that calculates
;;	 the value of the formula.
;;	 The formula can contain nested calculations using the four basic
;;	 mathematical operators, numeric constants, and symbols representing variables.
;;	 The returned function has to accept a single parameter containing the map
;;	 of variable names to their values.
;;
;; tags - functions
;; restricted - 
(ns offline-4clojure.p121
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 2 ((__ '(/ a b))
      '{b 8 a 16}))
(= 8 ((__ '(+ a b 2))
      '{a 2 b 4}))
(= [6 0 -4]
     (map (__ '(* (+ 2 a)
  	              (- 10 b)))
	        '[{a 1 b 8}
	          {b 5 a -2}
	          {a 2 b 11}]))
(= 1 ((__ '(/ (+ x 2)
              (* 3 (+ y 1))))
      '{x 4 y 1}))

))
