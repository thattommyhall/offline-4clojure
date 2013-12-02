;; Advanced Destructuring - Easy
;; Here is an example of some more sophisticated destructuring.
;; tags - destructuring
;; restricted - 
(ns offline-4clojure.p51
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))
))
