;; Write Roman Numerals - Medium
;; This is the inverse of <a href='92'>Problem 92</a>, but much easier. Given an integer smaller than 4000, return the corresponding roman numeral in uppercase, adhering to the <a href='http://www.numericana.com/answer/roman.htm#valid'>subtractive principle</a>.
;; tags - strings:math
;; restricted - 
(ns offline-4clojure.p104
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= "I" (__ 1))
(= "XXX" (__ 30))
(= "IV" (__ 4))
(= "CXL" (__ 140))
(= "DCCCXXVII" (__ 827))
(= "MMMCMXCIX" (__ 3999))
(= "XLVIII" (__ 48))
))
