;; Game of Life - Hard
;; The <a href="http://en.wikipedia.org/wiki/Conway's_Game_of_Life">game of life</a> is a cellular automaton devised by mathematician John Conway. <br/><br/>The 'board' consists of both live (#) and dead ( ) cells. Each cell interacts with its eight neighbours (horizontal, vertical, diagonal), and its next state is dependent on the following rules:<br/><br/>1) Any live cell with fewer than two live neighbours dies, as if caused by under-population.<br/>2) Any live cell with two or three live neighbours lives on to the next generation.<br/>3) Any live cell with more than three live neighbours dies, as if by overcrowding.<br/>4) Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.<br/><br/>Write a function that accepts a board, and returns a board representing the next generation of cells.
;; tags - game
;; restricted - 
(ns offline-4clojure.p94
  (:use clojure.test))

(def __
;; your solution here
)

(defn -main []
  (are [soln] soln
(= (__ ["      "  
        " ##   "
        " ##   "
        "   ## "
        "   ## "
        "      "])
   ["      "  
    " ##   "
    " #    "
    "    # "
    "   ## "
    "      "])
(= (__ ["     "
        "     "
        " ### "
        "     "
        "     "])
   ["     "
    "  #  "
    "  #  "
    "  #  "
    "     "])
(= (__ ["      "
        "      "
        "  ### "
        " ###  "
        "      "
        "      "])
   ["      "
    "   #  "
    " #  # "
    " #  # "
    "  #   "
    "      "])
))
