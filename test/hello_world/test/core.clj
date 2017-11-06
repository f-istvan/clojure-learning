(ns hello-world.test.core
  (:use [hello-world.core])
  (:use [clojure.test]))

(deftest replace-mr
  (is (= (log-search [] 1) nil) ))

(deftest replace-me1
  (is (= (log-search [1, 2] 3) nil) ))

(deftest replace-me2
  (is (= (log-search [3] 3) 0) ))

(deftest replace-me3
  (is (= (log-search [1, 5, 6] 1) 0) ))

(deftest replace-me4
  (is (= (log-search [1, 5, 6] 5) 1) ))

(deftest replace-me5
  (is (= (log-search [1, 5, 6] 6) 2) ))


(deftest replace-me6
  (is (= (log-search [1, 5, 5, 6] 5) 1) ))

(deftest replace-me7
  (is (= (log-search [1, 1, 5, 6] 1) 1) ))

(deftest replace-me8
  (is (= (log-search [1, 2, 6, 6] 6) 2) ))
