(ns rot-text.core-test
  (:require [clojure.test :refer :all]
            [rot-text.core :as core]))

(deftest numbers-to-letters-test
  (testing "numbers-to-letters"
    (is (=
         "D"
         (core/numbers-to-letters (- 4 1))))))

(deftest letters-to-numbers-test
  (testing "letters-to-numbers"
    (is (=
         (- 4 1)
         (core/letters-to-numbers "D")))))

(deftest rot-letter-test
  (testing "rot-letter"
    (is (=
         "D"
         (core/rot-letter 3 "A")))
    (is (=
         "Z"
         (core/rot-letter -1 "A")))))


