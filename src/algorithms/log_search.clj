(ns algorithms.log-search)

(defn log-search
  [elements, elem-to-find]
  (loop [left 0
         right (dec (count elements))]
    (when (<= left right)
      (let [middle (int (Math/floor (/ (+ left right) 2)))
            actual (nth elements middle)]
        (cond
          (= actual elem-to-find) middle
          (< actual elem-to-find) (recur (inc middle) right)
          (> actual elem-to-find) (recur left (dec middle)))))))
