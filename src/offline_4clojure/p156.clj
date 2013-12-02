;; Map Defaults - Elementary
;; When retrieving values from a map, you can specify default values in case the key is not found:<br/><br/>(= 2 (:foo {:bar 0, :baz 1} 2))<br/><br/>However, what if you want the map itself to contain the default values?  Write a function which takes a default value and a sequence of keys and constructs a map.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p156
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ 0 [:a :b :c]) {:a 0 :b 0 :c 0})
(= (__ "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
(= (__ [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})
))
