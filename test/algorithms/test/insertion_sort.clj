(ns algorithms.test.insertion-sort
  (:use algorithms.insertion-sort)
  (:use clojure.test))

(deftest init-test-1 (is (= (insertion-sort [] ) [])))

(deftest init-test-2 (is (= (insertion-sort [2 2 1] ) [1 2 2])))

(deftest init-test-3
  (is (= (insertion-sort [5 3 4 2 1 1] ) [1 1 2 3 4 5])))
