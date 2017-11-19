(ns algorithms.test.log-search
  (:use [algorithms.log-search])
  (:use [clojure.test]))

(deftest nil-tests
  (testing "empty-sequence"
    (is (= (log-search [] 1) nil) ))
  (testing "element-not-present"
    (is (= (log-search [1, 2] 3) nil) )))

(deftest element-present-tests
  (testing "one-length-sequence"
    (is (= (log-search [3] 3) 0) ))
  (testing "multi-elem-sequence"
    (is (= (log-search [1, 5, 6] 1) 0) )
    (is (= (log-search [1, 5, 6] 5) 1) )
    (is (= (log-search [1, 5, 6] 6) 2) )))

(deftest contains-same-elements-tests
  (is (= (log-search [1, 5, 5, 6] 5) 1) )
  (is (= (log-search [1, 1, 5, 6] 1) 1) )
  (is (= (log-search [1, 2, 6, 6] 6) 2) ))
