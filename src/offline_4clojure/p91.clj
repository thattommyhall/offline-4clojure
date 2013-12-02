;; Graph Connectivity - Hard
;; Given a graph, determine whether the graph is connected. A connected graph is such that a path exists between any two given nodes.<br/><br/>-Your function must return true if the graph is connected and false otherwise.<br/><br/>-You will be given a set of tuples representing the edges of a graph. Each member of a tuple being a vertex/node in the graph.<br/><br/>-Each edge is undirected (can be traversed either direction).
;;
;; tags - graph-theory
;; restricted - 
(ns offline-4clojure.p91
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= true (__ #{[:a :a]}))
(= true (__ #{[:a :b]}))
(= false (__ #{[1 2] [2 3] [3 1]
               [4 5] [5 6] [6 4]}))
(= true (__ #{[1 2] [2 3] [3 1]
              [4 5] [5 6] [6 4] [3 4]}))
(= false (__ #{[:a :b] [:b :c] [:c :d]
               [:x :y] [:d :a] [:b :e]}))
(= true (__ #{[:a :b] [:b :c] [:c :d]
              [:x :y] [:d :a] [:b :e] [:x :a]}))
))
