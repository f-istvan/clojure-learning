(ns hello-world.core)

(defn -main [& args])

(defn log-search
  [elements, elem-to-find]
  (loop [left 0
         right (- (count elements) 1)]
    (when (<= left right)
      (def m (int (Math/floor (/ (+ left right) 2))))
      (def actual (nth elements m))
        (cond
          (= actual elem-to-find) m
          (< actual elem-to-find) (recur (+ m 1) right)
          (> actual elem-to-find) (recur left (- m 1))))))


;; nil
;;https://clojure.org/api/cheatsheet
;;https://clojuredocs.org/clojure.core/str
;;https://simpletutorials.com/c/3036/Spacemacs+%28Vim+mode%29+Cheatsheet
;;https://github.com/bbatsov/clojure-style-guide
