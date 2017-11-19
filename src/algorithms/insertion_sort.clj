(ns algorithms.insertion-sort)


(defn insert
  [l k]
  (concat (filter #(< % k) l) [k] (filter #(> % k) l)))

(defn insertion-sort
  [input]
  (loop [i 0
         r input]
    (println r)
    (if (>= i (count input))
      r
      (recur (inc i)
             (concat
              (insert (take (+ i 1) r) (nth r i))
              (take-last (- (- (count input) i) 1) r))))))
