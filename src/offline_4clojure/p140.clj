;; Veitch, Please! - Hard
;; Create a function which accepts as input a boolean algebra function in the form of a set of sets, where the inner sets are collections of symbols corresponding to the input boolean variables which satisfy the function (the inputs of the inner sets are conjoint, and the sets themselves are disjoint... also known as canonical minterms).  Note:&nbsp;capitalized symbols represent truth, and lower-case symbols represent negation of the inputs.  Your function must return the minimal function which is logically equivalent to the input.
;;</br></br>
;;PS &mdash; You may want to give this a read before proceeding: <a href="http://en.wikipedia.org/wiki/K_map">K-Maps</a>
;;</br>
;;PPS &mdash; If you're interested in logic programming more generally, you should also check out: <a href="https://github.com/clojure/core.logic">core.logic</a>
;; tags - boolean-logic:data-analysis
;; restricted - 
(ns offline-4clojure.p140
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ #{#{'a 'B 'C 'd}
         #{'A 'b 'c 'd}
         #{'A 'b 'c 'D}
         #{'A 'b 'C 'd}
         #{'A 'b 'C 'D}
         #{'A 'B 'c 'd}
         #{'A 'B 'c 'D}
         #{'A 'B 'C 'd}})
   #{#{'A 'c} 
     #{'A 'b}
     #{'B 'C 'd}})
(= (__ #{#{'A 'B 'C 'D}
         #{'A 'B 'C 'd}})
   #{#{'A 'B 'C}})
(= (__ #{#{'a 'b 'c 'd}
         #{'a 'B 'c 'd}
         #{'a 'b 'c 'D}
         #{'a 'B 'c 'D}
         #{'A 'B 'C 'd}
         #{'A 'B 'C 'D}
         #{'A 'b 'C 'd}
         #{'A 'b 'C 'D}})
   #{#{'a 'c}
     #{'A 'C}})
(= (__ #{#{'a 'b 'c} 
         #{'a 'B 'c}
         #{'a 'b 'C}
         #{'a 'B 'C}})
   #{#{'a}})
(= (__ #{#{'a 'B 'c 'd}
         #{'A 'B 'c 'D}
         #{'A 'b 'C 'D}
         #{'a 'b 'c 'D}
         #{'a 'B 'C 'D}
         #{'A 'B 'C 'd}})
   #{#{'a 'B 'c 'd}
     #{'A 'B 'c 'D}
     #{'A 'b 'C 'D}
     #{'a 'b 'c 'D}
     #{'a 'B 'C 'D}
     #{'A 'B 'C 'd}})
(= (__ #{#{'a 'b 'c 'd}
         #{'a 'B 'c 'd}
         #{'A 'B 'c 'd}
         #{'a 'b 'c 'D}
         #{'a 'B 'c 'D}
         #{'A 'B 'c 'D}})
   #{#{'a 'c}
     #{'B 'c}})
(= (__ #{#{'a 'B 'c 'd}
         #{'A 'B 'c 'd}
         #{'a 'b 'c 'D}
         #{'a 'b 'C 'D}
         #{'A 'b 'c 'D}
         #{'A 'b 'C 'D}
         #{'a 'B 'C 'd}
         #{'A 'B 'C 'd}})
   #{#{'B 'd}
     #{'b 'D}})
(= (__ #{#{'a 'b 'c 'd}
         #{'A 'b 'c 'd}
         #{'a 'B 'c 'D}
         #{'A 'B 'c 'D}
         #{'a 'B 'C 'D}
         #{'A 'B 'C 'D}
         #{'a 'b 'C 'd}
         #{'A 'b 'C 'd}})
   #{#{'B 'D}
     #{'b 'd}})
))
