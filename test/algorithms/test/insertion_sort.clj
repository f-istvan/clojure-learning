(ns algorithms.test.insertion-sort
  (:use algorithms.insertion-sort)
  (:use clojure.test))

(deftest identical-sorts
  (testing "empty seq"
    (is (= (isort []) []) ))
  (testing "one length sequence"
    (is (= (isort [1]) [1])))
  (testing "only same elements"
    (is (= (isort [0 0 0]) [0 0 0]))))

(deftest duplicate-elements
  (testing "Duplicates at the begining"
    (is (= (isort [2 2 1]) [1 2 2])))
  (testing "Duplicates in the middle"
    (is (= (isort [5 2 2 6]) [2 2 5 6])))
  (testing "Duplicates at the end"
    (is (= (isort [8 3 3]) [3 3 8]))))

(deftest long-sequence
  (testing "Long sequence including negatives")
  (let [i 300]
    (is (= (isort (shuffle (range (- i) i))) (range (- i) i)))))
