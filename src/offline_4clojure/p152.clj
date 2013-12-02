;; Latin Square Slicing - Hard
;; <p>
;;A <a href="http://en.wikipedia.org/wiki/Latin_square">Latin square</a> of order <code>n</code> 
;;is an <code>n x n</code> array that contains <code>n</code> different elements, 
;;each occurring exactly once in each row, and exactly once in each column. 
;;For example, among the following arrays <i>only the first one</i> forms a Latin square:
;;<pre>
;;A B C    A B C    A B C
;;B C A    B C A    B D A
;;C A B    C A C    C A B
;;</pre>
;;</p>
;;<p>
;;Let <code>V</code> be a vector of such vectors<sup>1</sup> that they may differ in length<sup>2</sup>.
;;We will say that an arrangement of vectors of <code>V</code> in consecutive rows 
;;is an <em>alignment (of vectors) of</em> <code>V</code>
;;if the following conditions are satisfied:
;;<ul>
;;<li>All vectors of <code>V</code> are used.</li>
;;<li>Each row contains just one vector.</li>
;;<li>The order of <code>V</code> is preserved.</li>
;;<li>All vectors of maximal length are horizontally aligned each other.</li>
;;<li>If a vector is not of maximal length then all its elements are aligned 
;;    with elements of some <a href="http://clojuredocs.org/clojure_core/clojure.core/subvec">subvector</a> 
;;    of a vector of maximal length.</li>
;;</ul>
;;Let <code>L</code> denote a Latin square of order 2 or greater.
;;We will say that <code>L</code> <em>is included</em> in <code>V</code> or 
;;that <code>V</code> <em>includes</em> <code>L</code>
;;iff there exists an alignment of <code>V</code> 
;;such that contains a subsquare that is equal to <code>L</code>.
;;</p>
;;<p>
;;For example, if <code>V</code> equals <code>[[1 2 3][2 3 1 2 1][3 1 2]]</code> 
;;then there are nine alignments of <code>V</code> (brackets omitted):
;;<pre> 
;;        1              2              3
;;
;;      1 2 3          1 2 3          1 2 3
;;  A   2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
;;      3 1 2        3 1 2        3 1 2
;;
;;      1 2 3          1 2 3          1 2 3
;;  B   2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
;;        3 1 2        3 1 2        3 1 2
;;
;;      1 2 3          1 2 3          1 2 3
;;  C   2 3 1 2 1    2 3 1 2 1    2 3 1 2 1
;;          3 1 2        3 1 2        3 1 2
;;</pre>
;;Alignment <b>A1</b> contains Latin square <code>[[1 2 3][2 3 1][3 1 2]]</code>, 
;;alignments <b>A2, A3, B1, B2, B3</b> contain no Latin squares, and alignments
;;<b>C1, C2, C3</b> contain <code>[[2 1][1 2]]</code>.
;;Thus in this case <code>V</code> includes one Latin square of order 3 
;;and one of order 2 which is included three times.
;;</p>
;;<p>
;;Our aim is to implement a function which accepts a vector of vectors <code>V</code> as an argument, 
;;and returns a map which keys and values are integers. 
;;Each key should be the order of a Latin square included in <code>V</code>, 
;;and its value a count of <i>different</i> Latin squares of that order included in <code>V</code>. 
;;If <code>V</code> does not include any Latin squares an empty map should be returned.
;;In the previous example the correct output of such a function is {3 1, 2 1} and <i>not</i> {3 1, 2 3}.
;;</p>
;;<p>
;;<sup>1</sup> Of course, we can consider sequences instead of vectors. 
;;<br />
;;<sup>2</sup> Length of a vector is the number of elements in the vector.
;;</p>
;; tags - data-analysis:math
;; restricted - 
(ns offline-4clojure.p152
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ '[[A B C D]
         [A C D B]
         [B A D C]
         [D C A B]])
   {})
(= (__ '[[A B C D E F]
         [B C D E F A]
         [C D E F A B]
         [D E F A B C]
         [E F A B C D]
         [F A B C D E]])
   {6 1})
(= (__ '[[A B C D]
         [B A D C]
         [D C B A]
         [C D A B]])
   {4 1, 2 4})
(= (__ '[[B D A C B]
         [D A B C A]
         [A B C A B]
         [B C A B C]
         [A D B C A]])
   {3 3})
(= (__ [  [2 4 6 3]
        [3 4 6 2]
          [6 2 4]  ])
   {})
(= (__ [[1]
        [1 2 1 2]
        [2 1 2 1]
        [1 2 1 2]
        []       ])
   {2 2})
(= (__ [[3 1 2]
        [1 2 3 1 3 4]
        [2 3 1 3]    ])
   {3 1, 2 2})
(= (__ [[8 6 7 3 2 5 1 4]
        [6 8 3 7]
        [7 3 8 6]
        [3 7 6 8 1 4 5 2]
              [1 8 5 2 4]
              [8 1 2 4 5]])
   {4 1, 3 1, 2 7})
))
