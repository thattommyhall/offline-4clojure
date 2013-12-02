;; For Science! - Hard
;; A mad scientist with tenure has created an experiment tracking mice in a maze.  Several mazes have been randomly generated, and you've been tasked with writing a program to determine the mazes in which it's possible for the mouse to reach the cheesy endpoint.  Write a function which accepts a maze in the form of a collection of rows, each row is a string where:
;;<ul>
;;<li>spaces represent areas where the mouse can walk freely</li>
;;<li>hashes (#) represent walls where the mouse can not walk</li>
;;<li>M represents the mouse's starting point</li>
;;<li>C represents the cheese which the mouse must reach</li>
;;</ul>
;;The mouse is not allowed to travel diagonally in the maze (only up/down/left/right), nor can he escape the edge of the maze.  Your function must return true iff the maze is solvable by the mouse.
;; tags - game
;; restricted - 
(ns offline-4clojure.p117
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= true  (__ ["M   C"]))
(= false (__ ["M # C"]))
(= true  (__ ["#######"
              "#     #"
              "#  #  #"
              "#M # C#"
              "#######"]))
(= false (__ ["########"
              "#M  #  #"
              "#   #  #"
              "# # #  #"
              "#   #  #"
              "#  #   #"
              "#  # # #"
              "#  #   #"
              "#  #  C#"
              "########"]))
(= false (__ ["M     "
              "      "
              "      "
              "      "
              "    ##"
              "    #C"]))
(= true  (__ ["C######"
              " #     "
              " #   # "
              " #   #M"
              "     # "]))
(= true  (__ ["C# # # #"
              "        "
              "# # # # "
              "        "
              " # # # #"
              "        "
              "# # # #M"]))
))
