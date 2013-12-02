;; Pairwise Disjoint Sets - Easy
;; 
;;<p>
;;Given a set of sets, create a function which returns <code>true</code> 
;;if no two of those sets have any elements in common<sup>1</sup> and <code>false</code> otherwise. 
;;Some of the test cases are a bit tricky, so pay a little more attention to them. 
;;</p>
;;
;;<p>
;;<sup>1</sup>Such sets are usually called <i>pairwise disjoint</i> or <i>mutually disjoint</i>.
;;</p>
;;
;; tags - set-theory
;; restricted - 
(ns offline-4clojure.p153
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}})
   true)
(= (__ #{#{:a :b :c :d :e}
         #{:a :b :c :d}
         #{:a :b :c}
         #{:a :b}
         #{:a}})
   false)
(= (__ #{#{[1 2 3] [4 5]}
         #{[1 2] [3 4 5]}
         #{[1] [2] 3 4 5}
         #{1 2 [3 4] [5]}})
   true)
(= (__ #{#{'a 'b}
         #{'c 'd 'e}
         #{'f 'g 'h 'i}
         #{''a ''c ''f}})
   true)
(= (__ #{#{'(:x :y :z) '(:x :y) '(:z) '()}
         #{#{:x :y :z} #{:x :y} #{:z} #{}}
         #{'[:x :y :z] [:x :y] [:z] [] {}}})
   false)
(= (__ #{#{(= "true") false}
         #{:yes :no}
         #{(class 1) 0}
         #{(symbol "true") 'false}
         #{(keyword "yes") ::no}
         #{(class '1) (int \0)}})
   false)
(= (__ #{#{distinct?}
         #{#(-> %) #(-> %)}
         #{#(-> %) #(-> %) #(-> %)}
         #{#(-> %) #(-> %) #(-> %)}})
   true)
(= (__ #{#{(#(-> *)) + (quote mapcat) #_ nil}
         #{'+ '* mapcat (comment mapcat)}
         #{(do) set contains? nil?}
         #{, , , #_, , empty?}})
   false)
))
