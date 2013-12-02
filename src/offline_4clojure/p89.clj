;; Graph Tour - Hard
;; Starting with a graph you must write a function that returns true if it is possible to make a tour of the graph in which every edge is visited exactly once.<br/><br/>The graph is represented by a vector of tuples, where each tuple represents a single edge.<br/><br/>The rules are:<br/><br/>- You can start at any node.<br/>- You must visit each edge exactly once.</br>- All edges are undirected.
;; tags - graph-theory
;; restricted - 
(ns offline-4clojure.p89
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= true (__ [[:a :b]]))
(= false (__ [[:a :a] [:b :b]]))
(= false (__ [[:a :b] [:a :b] [:a :c] [:c :a]
               [:a :d] [:b :d] [:c :d]]))
(= true (__ [[1 2] [2 3] [3 4] [4 1]]))
(= true (__ [[:a :b] [:a :c] [:c :b] [:a :e]
              [:b :e] [:a :d] [:b :d] [:c :e]
              [:d :e] [:c :f] [:d :f]]))
(= false (__ [[1 2] [2 3] [2 4] [2 5]]))
))
