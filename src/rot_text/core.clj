(ns rot-text.core
  (:gen-class))

(def alphabet
  ["A"
   "B"
   "C"
   "D"
   "E"
   "F"
   "G"
   "H"
   "I"
   "J"
   "K"
   "L"
   "M"
   "N"
   "O"
   "P"
   "Q"
   "R"
   "S"
   "T"
   "U"
   "V"
   "W"
   "X"
   "Y"
   "Z"])

(def numbers-to-letters
  (apply merge (map-indexed (fn [id a] {id a}) alphabet)))

(def letters-to-numbers
  (apply merge (map-indexed (fn [id a] {a id}) alphabet)))

(defn rot-letter [n l]
  (if
   (get letters-to-numbers l)
    (as-> l $
      (get letters-to-numbers $)
      (+ n $)
      (rem $ 26)
      (get numbers-to-letters $))
    l))

(defn rot-text [n text]
  (as-> text $
    (clojure.string/upper-case $)
    (clojure.string/split $ #"")
    (map (partial rot-letter n) $)
    (clojure.string/join "" $)))

(defn -main
  "Ceasar cipher fun"
  [& args]
  (println
   (rot-text
    (Integer/parseInt (first args))
    (second args))))
