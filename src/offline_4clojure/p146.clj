;; Trees into tables - Easy
;; <p>Because Clojure's <code>for</code> macro allows you to "walk" over multiple sequences in a nested fashion, it is excellent for transforming all sorts of sequences. If you don't want a sequence as your final output (say you want a map), you are often still best-off using <code>for</code>, because you can produce a sequence and feed it into a map, for example.</p>
;;
;;<p>For this problem, your goal is to "flatten" a map of hashmaps. Each key in your output map should be the "path"<sup>1</sup> that you would have to take in the original map to get to a value, so for example <code>{1 {2 3}}</code> should result in <code>{[1 2] 3}</code>. You only need to flatten one level of maps: if one of the values is a map, just leave it alone.</p>
;;
;;<p><sup>1</sup> That is, <code>(get-in original [k1 k2])</code> should be the same as <code>(get result [k1 k2])</code></p>
;; tags - seqs:maps
;; restricted - 
(ns offline-4clojure.p146
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ '{a {p 1, q 2}
         b {m 3, n 4}})
   '{[a p] 1, [a q] 2
     [b m] 3, [b n] 4})
(= (__ '{[1] {a b c d}
         [2] {q r s t u v w x}})
   '{[[1] a] b, [[1] c] d,
     [[2] q] r, [[2] s] t,
     [[2] u] v, [[2] w] x})
(= (__ '{m {1 [a b c] 3 nil}})
   '{[m 1] [a b c], [m 3] nil})
))
