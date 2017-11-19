(ns algorithms.insertion-sort)


(defn insert
  [l k]
  (concat (filter #(<= % k) l) [k] (filter #(> % k) l)))

(defn insertion-sort
  [input]
  (loop [i 0
         r input]
    (println i)
    (if (>= i (count input))
      r
      (recur (inc i)
             (concat
              (insert (take i r)
                      (nth r i))
              (take-last (- (- (count input) i) 1) r))))))
