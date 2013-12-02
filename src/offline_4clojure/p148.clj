;; The Big Divide - Medium
;; <p>Write a function which calculates the sum of all natural numbers under <i>n</i> (first argument) which are evenly divisible by at least one of <i>a</i> and <i>b</i> (second and third argument). Numbers <i>a</i> and <i>b</i> are guaranteed to be <a href="http://en.wikipedia.org/wiki/Coprime">coprimes</a>.</p>
;;
;;<p>Note: Some test cases have a very large <i>n</i>, so the most obvious solution will exceed the time limit.</p>
;; tags - math
;; restricted - 
(ns offline-4clojure.p148
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= 0 (__ 3 17 11))
(= 23 (__ 10 3 5))
(= 233168 (__ 1000 3 5))
(= "2333333316666668" (str (__ 100000000 3 5)))
(= "110389610389889610389610"
  (str (__ (* 10000 10000 10000) 7 11)))
(= "1277732511922987429116"
  (str (__ (* 10000 10000 10000) 757 809)))
(= "4530161696788274281"
  (str (__ (* 10000 10000 1000) 1597 3571)))
))
